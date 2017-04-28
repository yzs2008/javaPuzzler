package com.zzu.kaidi.java.puzzles.reentrantlock;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by kaidi on 17-4-18.
 */
public class ThreadMain {

    public static void main(String[] args) throws InterruptedException {

        ShareVar val = new ShareVar();
        List<Thread> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            ThreadB b = new ThreadB(val, String.format("tb%2d", i));
            Thread t = new Thread(b);
            t.start();
            list.add(t);
        }

        for(Thread t : list){
            t.join();
        }

        System.out.println("result "+val.i);
    }
}
