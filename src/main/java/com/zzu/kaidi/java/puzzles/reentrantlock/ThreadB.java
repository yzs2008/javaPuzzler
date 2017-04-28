package com.zzu.kaidi.java.puzzles.reentrantlock;

import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by kaidi on 17-4-18.
 */
public class ThreadB implements Runnable {
    ShareVar shareVar;
    String name;

    public ThreadB(ShareVar val, String name) {
        this.name = name;
        this.shareVar = val;
    }

    @Override
    public void run() {
        int v = shareVar.get();
        System.out.println(name + "读取值：" + v);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        shareVar.set(v);
        System.out.println(shareVar.get());
    }
}
