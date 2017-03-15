package com.zzu.kaidi.java.puzzles.puzzlers.generic;

/**
 * Created by IntelliJ IDEA.
 * User: kaidi
 * Date: 2016/2/19
 * Time: 21:11
 * Write the code, Change the world.
 */
public class BoxModel<T> {
  T val;

  public void setVal(T t) {
    val = t;
  }

  public T getVal() {
    return val;
  }
}
