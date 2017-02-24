package com.zzu.kaidi.java.puzzles.pattern.puzzlers.daily.study;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;

/**
 * Created by IntelliJ IDEA.
 * User: kaidi
 * Date: 2016/5/14
 * Time: 18:08
 * Write the code, Change the world.
 * 测试两个知识点：
 * 1. 测试在while（true）循环中，能否使用return语句结束循环，结果是可以的
 * 2. 测试匿名内部类对外部类变量的更改，其实匿名类是不能修改外部类的变量的，只能是final引用。
 * 但是通过final 的list，修改List值来实现。
 * 此处fianl list 实际上就是一个常量引用，该引用不可变，但是其指向的值可以变
 */
public class WhileReturnTest {

  private interface Command<T> {
    T execute();
  }

  public static void main(String[] args) throws InterruptedException {
    String result = executeOpe(() -> {
      System.out.println("hello world!");
      return "yes";
    });
    System.out.println(result);
    final List<Integer> labaratoryRat = new ArrayList<>();

    new Thread(() -> {
      try {
        System.out.println("I am another thread!");
        Thread.sleep(500L);
        labaratoryRat.add(10);
        System.out.println("I am done");
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }).start();

    String result2 = executeRepeate(() -> {
      int rat = labaratoryRat.get(0).intValue();
      return "message done";
    });

    System.out.println(result2);


  }

  private static <T> T executeOpe(Command<T> command) {
    while (true) {
      return command.execute();
    }
  }

  private static <T> T executeRepeate(Command<T> command) throws InterruptedException {
    while (true) {
      try {
        return command.execute();
      } catch (IndexOutOfBoundsException e) {
        System.out.println("exception!");
        System.out.println("I will try again!");
        Thread.sleep(100L);
      }
    }
  }
}
