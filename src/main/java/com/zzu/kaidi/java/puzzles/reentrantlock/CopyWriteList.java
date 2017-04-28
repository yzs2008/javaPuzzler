package com.zzu.kaidi.java.puzzles.reentrantlock;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by kaidi on 17-4-18.
 */
public class CopyWriteList {

    public static void main(String[] args) throws InterruptedException {
        MyCopyWriteList<Integer> cowList = new MyCopyWriteList<>();
        cowList.add(1);
        cowList.add(2);
        cowList.add(3);
        cowList.add(4);
        cowList.add(5);
        List<Thread> list = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            ThreadC c = new ThreadC(cowList, String.format("tb%2d", i));
            Thread t = new Thread(c);
            t.start();
            list.add(t);
        }

        for (Thread t : list) {
            t.join();
        }

        System.out.println("result " + cowList.get(0));
    }

}
