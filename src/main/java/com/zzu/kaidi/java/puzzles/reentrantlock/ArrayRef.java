package com.zzu.kaidi.java.puzzles.reentrantlock;

/**
 * Created by kaidi on 17-4-18.
 * 数组是值类型
 */
public class ArrayRef {
    int[] arr = new int[]
            {
                    1, 2, 3
            };

    public static void main(String[] args) {
        ArrayRef rer = new ArrayRef();
        rer.get(rer.getArray());
        rer.set();
        rer.get(rer.getArray());
    }

    private int[] getArray() {
        return arr;
    }

    private void get(int[] input) {
        set();
        System.out.println(input[0]);
    }

    private void set() {
        int[] xy = new int[10];
        xy[0] = 10;
        arr = xy;
    }
}
