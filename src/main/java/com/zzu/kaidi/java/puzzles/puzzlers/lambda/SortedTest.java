package com.zzu.kaidi.java.puzzles.puzzlers.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by kaidi on 17-2-23.
 */
public class SortedTest {
    public static void main(String[] args) {
        //List<Integer> sourceList = Arrays.asList(10, 2, 13, 4, 6, 7, 32, 2);
        List<Integer> sourceList = Arrays.asList(1, 2, 3, 4, 4, 4, 6, 7, 32);
        List<Integer> resultList = sourceList.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println("sorted result:");
        for (Integer val : resultList) {
            System.out.print(val + ",");
        }
        System.out.println();


    }
}
