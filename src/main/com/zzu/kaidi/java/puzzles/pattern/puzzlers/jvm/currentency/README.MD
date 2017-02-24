##Java同步机制理解
---

    import java.util.concurrent.locks.Condition;
    import java.util.concurrent.locks.Lock;
    import java.util.concurrent.locks.ReentrantLock;
    /**
    **这是一个共享对象，模拟“消费者-生产者”的问题。
    **
    **生产者（P）不断的向队列中放数据，但是当队列满的时候，生产者线程需要等待。
    **消费者（C）不断的从队列中取数据，但是当队列空的时候，消费者线程需要等待。
    **
    **在等待过程中，如果另一方执行完毕一个动作，则会通知另一方活动
    **例如：P等待，说明队列为满。在P等待过程中，若C完成一个操作，也即消费掉一个数据，
    **则此时队列不为空，所以P可以恢复执行。此时C会通知P继续执行。
    **
    **
    **/
    public class SharedFiFoQueue {

        private Object[] elems = null; //队列使用数组模拟
        private int current = 0; //当前索引
        private int placeIndex = 0; //放入的索引
        private int removeIndex = 0; //消费的索引
        
        private final Lock lock = new ReentrantLock(); //控制同步的lock对象
        private final Condition isEmpty = lock.newCondition(); //线程同步的关键对象 condition
        private final Condition isFull = lock.newCondition(); //线程同步的关键对象 condition
        
        public SharedFiFoQueue(int capacity) {
            this.elems = new Object[capacity]; //初始化对象时，指定队列大小
        }
        
        //模拟生产
        public void add(Object elem) throws InterruptedException {
            lock.lock(); //代码开始加锁
            while(current >= elems.length) //先判断队列是否为满
                isFull.await(); //满，等待，此处实现细节下面详细讲述
        
            elems[placeIndex] = elem; //队列未满，添加对象
            
            //We need the modulo, in order to avoid going out of bounds.
            placeIndex = (placeIndex + 1) % elems.length;
            
            ++current;
            
            //Notify the consumer that there is data available.
            isEmpty.signal(); //通知所有等待消费的线程，可以消费了
            
            lock.unlock(); //解锁
        }

        //模拟消费
        public Object remove() throws InterruptedException {
            Object elem = null;
            
            lock.lock();
            while(current <= 0) //判断队列是否为空
                isEmpty.await(); //队列为空，需要等待
        
            elem = elems[removeIndex];

            //We need the modulo, in order to avoid going out of bounds.
            removeIndex = (removeIndex + 1) % elems.length;
            
            --current;
            
            //Notify the producer that there is space available.
            isFull.signal(); //通知所有生产者线程，可以继续向队列中添加对象
            
            lock.unlock();
            
            return elem;
        }
    }


实现线程间通信，强依赖于Condition对象，其实现如下：

    public class ConditionObject implements Condition, java.io.Serializable {
        private static final long serialVersionUID = 1173984872572414699L;
        //首先看到的就是Condition对象维护两个链表
        /** First node of condition queue. */
        private transient Node firstWaiter;
        /** Last node of condition queue. */
        private transient Node lastWaiter;
        
        .
        .
        .
        /**
         * Implements interruptible condition wait.
         * <ol>
         * <li> If current thread is interrupted, throw InterruptedException.
         * <li> Save lock state returned by {@link #getState}.
         * <li> Invoke {@link #release} with saved state as argument,
         *      throwing IllegalMonitorStateException if it fails.
         * <li> Block until signalled or interrupted.
         * <li> Reacquire by invoking specialized version of
         *      {@link #acquire} with saved state as argument.
         * <li> If interrupted while blocked in step 4, throw InterruptedException.
         * </ol>
         */
        public final void await() throws InterruptedException {
            if (Thread.interrupted())
                throw new InterruptedException();
            //在这里把该线程放进等待线程队列（condition自身维护该队列）
            Node node = addConditionWaiter();
            int savedState = fullyRelease(node);
            int interruptMode = 0;
            while (!isOnSyncQueue(node)) {
                //这里是调用操作系统层面的线程阻塞，挂起该线程
                LockSupport.park(this);
                if ((interruptMode = checkInterruptWhileWaiting(node)) != 0)
                    break;
            }
            if (acquireQueued(node, savedState) && interruptMode != THROW_IE)
                interruptMode = REINTERRUPT;
            if (node.nextWaiter != null) // clean up if cancelled
                unlinkCancelledWaiters();
            if (interruptMode != 0)
                reportInterruptAfterWait(interruptMode);
        }

接着我们看看signal的实现

        /**
         * Moves the longest-waiting thread, if one exists, from the
         * wait queue for this condition to the wait queue for the
         * owning lock.
         *
         * @throws IllegalMonitorStateException if {@link #isHeldExclusively}
         *         returns {@code false}
         */
        public final void signal() {
            if (!isHeldExclusively())
                throw new IllegalMonitorStateException();
            Node first = firstWaiter;
            if (first != null)
                doSignal(first); //这里会遍历等待队列，
        }
        /**
         * Removes and transfers nodes until hit non-cancelled one or
         * null. Split out from signal in part to encourage compilers
         * to inline the case of no waiters.
         * @param first (non-null) the first node on condition queue
         */
        private void doSignal(Node first) {
            do {
                if ( (firstWaiter = first.nextWaiter) == null)
                    lastWaiter = null;
                first.nextWaiter = null;
            } while (!transferForSignal(first) &&
                     (first = firstWaiter) != null);
        }
        /**
         * Transfers a node from a condition queue onto sync queue.
         * Returns true if successful.
         * @param node the node
         * @return true if successfully transferred (else the node was
         * cancelled before signal)
         */
        final boolean transferForSignal(Node node) {
            /*
             * If cannot change waitStatus, the node has been cancelled.
             */
            if (!compareAndSetWaitStatus(node, Node.CONDITION, 0))
                return false;

            /*
             * Splice onto queue and try to set waitStatus of predecessor to
             * indicate that thread is (probably) waiting. If cancelled or
             * attempt to set waitStatus fails, wake up to resync (in which
             * case the waitStatus can be transiently and harmlessly wrong).
             */
            Node p = enq(node);
            int ws = p.waitStatus;
            if (ws > 0 || !compareAndSetWaitStatus(p, ws, Node.SIGNAL))
                LockSupport.unpark(node.thread); //在这里从操作系统层面发送唤醒信号
            return true;
        }
        
最后发现，其实是一个很像观察者模式的实现机制