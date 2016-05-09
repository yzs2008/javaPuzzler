## 观察者模式

`观察者模式定义了一种一对多的依赖关系，
当主体对象改变时，所有监听它的对象都能获得通知，
并作出相应的更新操作`

> 观察者模式中主要有以下对象：
> 1. subject对象，被观察者，主体对象
> 2. observer接口，观察者类型，定义观察者收取主体对象变化通知的方法接口
> 3. concreteObserver类，具体的观察者对象
>> `ps. directorTest 是模式调用demo`


 **观察者模式结构图**

![观察者模式结构图](http://img.my.csdn.net/uploads/201304/16/1366084549_1157.png)

观察者模式可以和单例模式结合，提供全局唯一的被观察者，此时，需要注意在添加观察者和移除观察者时的线程同步问题。
单例模式的线程安全可以提供参考。
jdk中提供的观察者模式实现可以参考java.util.Observable

        public synchronized void addObserver(Observer o) {
            if (o == null)
                throw new NullPointerException();
            if (!obs.contains(o)) {
                obs.addElement(o);
            }
        }