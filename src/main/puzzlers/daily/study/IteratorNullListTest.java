package main.puzzlers.daily.study;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * 用for循环，遍历空list，会抛出空指针异常
 * 当list为空时，可以直接跳过该语句
 */
public class IteratorNullListTest {

  public static void main(String[] args) {
    List<String> nullList = returnNull();
    List<String> emptyList = returnEmptyList();

    try {
      for (String s : nullList) {
        System.out.println("这里会抛异常！");
      }
    } catch (NullPointerException e) {
      System.out.println("空指针异常: " + e.getMessage());
    }

    for (String s : emptyList) {
      System.out.println("不会执行到这里，直接跳过，不抛异常。");
    }




  }

  public static List<String> returnNull() {
    return null;
  }

  public static List<String> returnEmptyList() {
    return new ArrayList<>();
  }

}
