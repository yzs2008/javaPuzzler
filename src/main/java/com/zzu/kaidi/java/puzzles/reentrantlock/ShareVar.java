package com.zzu.kaidi.java.puzzles.reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by kaidi on 17-4-18.
 */
public class ShareVar {
    int i = 0;
    ReentrantLock l = new ReentrantLock();

    public void set(int v){
        l.lock();
        i= v;
        System.out.println(" in set now i = " + i);
    }
    public int get(){
        l.lock();
        System.out.println(" in get");
        set(i++);
        return i;
    }
}
