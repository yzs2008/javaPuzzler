package com.zzu.kaidi.java.puzzles.reentrantlock;

import java.util.IdentityHashMap;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by kaidi on 17-4-18.
 */
public class ThreadC implements Runnable {
    MyCopyWriteList<Integer> data;
    String name;

    public ThreadC(MyCopyWriteList<Integer> input, String name) {
        this.data = input;
        this.name = "ThreadC" + name;
    }

    @Override
    public void run() {
        if (name.equals("ThreadCtb 1")) {
            sort();
        } else {
            get();
        }
    }

    void get() {
        System.out.println(String.format("cc%s查询开始", name));
        System.out.println(name + "result:" + data.get(0));
        System.out.println(String.format("cc%s查询结束", name));
    }

    void sort() {
        data.sort((a, b) -> b - a);
        System.out.println("sort done");
        System.out.println(data.getArray());
    }

}
