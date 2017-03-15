package com.zzu.kaidi.java.puzzles.design.pattern.observerPattern;

/**
 * Created by IntelliJ IDEA.
 * User: kaidi
 * Date: 2016/5/9
 * Time: 8:21
 * Write the code, Change the world.
 */
public class ConcreteObserverA implements Observer {

  private String name = "I am the king!";

  @Override
  public void getNotify() {
    System.out.println(name);
  }
}
