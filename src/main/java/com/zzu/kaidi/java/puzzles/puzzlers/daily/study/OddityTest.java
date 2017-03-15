package com.zzu.kaidi.java.puzzles.puzzlers.daily.study;

/**
 * @author kaidi
 */
public class OddityTest {

  /**
   * 判断数值奇偶性
   * 1%2=1
   * -9%2=-1
   * so the method will return wrong result when the i is negative.
   * the definition of "%": (a/b)*b+(a%b)=a
   */
  public static boolean isOdd(int i) {
    return i % 2 == 1;
  }

  /**
   * the normal solution
   */
  public static boolean isOdd_normal(int i) {
    return i % 2 == 1 || i % 2 == -1;
  }

  /**
   * the better solution
   */
  public static boolean isOdd_better(int i) {
    return i % 2 != 0;
  }

  /**
   * the best solution
   */
  public static boolean isOdd_best(int i) {
    return (i & 1) != 0;
  }

  public static void main(String[] args) {
    System.out.println("the puzzler method:");
    System.out.println(OddityTest.isOdd(1));
    System.out.println(OddityTest.isOdd(2));
    System.out.println(OddityTest.isOdd(-9));

    System.out.println("the normal solution method:");
    System.out.println(OddityTest.isOdd_normal(1));
    System.out.println(OddityTest.isOdd_normal(2));
    System.out.println(OddityTest.isOdd_normal(-9));

    System.out.println("the better solution method:");
    System.out.println(OddityTest.isOdd_better(1));
    System.out.println(OddityTest.isOdd_better(2));
    System.out.println(OddityTest.isOdd_better(-9));

    System.out.println("the best solution method:");
    System.out.println(OddityTest.isOdd_best(1));
    System.out.println(OddityTest.isOdd_best(2));
    System.out.println(OddityTest.isOdd_best(-9));
  }

}
