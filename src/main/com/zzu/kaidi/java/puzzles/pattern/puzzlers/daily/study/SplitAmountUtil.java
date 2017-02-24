package com.zzu.kaidi.java.puzzles.pattern.puzzlers.daily.study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by kaidi on 2016/10/17.
 * version 1.0 最大支持512的递归堆栈，也即最多拆分512笔
 */
public class SplitAmountUtil {

    /**
     * 最大递归堆栈深度，防止递归堆栈溢出，暂定512
     */
    private final Integer maxStackDeep = 512;

    /**
     * 数字拆分
     *
     * @param X   输入值
     * @param max 输出最大值
     * @param min 输出最小值
     * @return 结果
     */
    public List<Integer> splitAmount(Integer X, int max, int min) {
        /************************检查输入是否合法**********************************/
        //最小值为0，非法
        if (min <= 0) {
            return null;
        }
        //输入小于最小值, 非法
        if (X < min) {
            return null;
        }
        //最小值大于最大值，非法
        if (min > max) {
            return null;
        }
        //最小值等于最大值，但是金额不是最大值整数倍，非法
        if ((min == max) && (X % max != 0)) {
            return null;
        }
        /************************检查输入合法结束**********************************/

        /************************计算调用批次，防止递归堆栈溢出**********************************/
        int stackDeep = (X + max - 1) / max;//向上取整
        if (stackDeep > maxStackDeep) {
            return superWorker(X, max, min, new ArrayList<>());
        } else {
            return worker(X, max, min, new ArrayList<>());
        }
        /************************计算调用批次，防止递归堆栈溢出结束**********************************/

    }

    private List<Integer> superWorker(Integer X, int max, int min, ArrayList<Integer> result) {
        return null;
    }

    public List<Integer> worker(Integer X, int max, int min, List<Integer> result) {

        if (X <= max) {
            result.add(X);
            return result;
        }

        if (X - max >= min) {
            result.add(max);
            return worker(X - max, max, min, result);
        } else {
            result.add(min);
            return worker(X - min, max, min, result);
        }
    }

    public static void main(String[] args) {

        SplitAmountUtil splitAmount = new SplitAmountUtil();
        int max = 5000;
        int min = 15;

        //List<Integer> mockX = Arrays.asList(1, 10, 15, 16, 20, 100, 105, 49999, 50000, 500001, 50015, 500016, 500020, 100000, 10000004);
        List<Integer> mockX = Arrays.asList(Integer.MAX_VALUE);

        for (Integer x : mockX) {
            List<Integer> result = splitAmount.splitAmount(x, max, min);
            splitAmount.showResult(result);
        }
    }

    private void showResult(List<Integer> result) {
        System.out.println("**************************************");
        if (result == null) {
            System.out.println("result is null.");
            return;
        }
        result.forEach(System.out::println);
        System.out.println("**************************************");
    }

}
