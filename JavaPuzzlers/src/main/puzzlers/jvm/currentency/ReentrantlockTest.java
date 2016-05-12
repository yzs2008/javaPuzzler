package main.puzzlers.jvm.currentency;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by IntelliJ IDEA.
 * User: kaidi
 * Date: 2016/5/12
 * Time: 17:02
 * Write the code, Change the world.
 */
public class ReentrantlockTest {
  public static void main(String[] args) {
    final ExecutorService exeService = Executors.newFixedThreadPool(4);
    final ReentrantLock lock = new ReentrantLock();
    final Condition con = lock.newCondition();
    final int time = 5;
    final Runnable add = new Runnable() {
      @Override
      public void run() {
        System.out.println("Pre:" + lock);
        lock.lock();
        try {
          con.await(time, TimeUnit.SECONDS);
          Thread.sleep(5000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        } finally {
          System.out.println("post:" + lock.toString());
          lock.unlock();
        }
      }
    };
    for (int index = 0; index < 4; index++) {
      exeService.submit(add);
    }
    exeService.shutdown();
  }
}
