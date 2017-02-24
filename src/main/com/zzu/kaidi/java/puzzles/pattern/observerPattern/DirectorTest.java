package com.zzu.kaidi.java.puzzles.pattern.observerPattern;

/**
 * Created by IntelliJ IDEA.
 * User: kaidi
 * Date: 2016/5/9
 * Time: 8:21
 * Write the code, Change the world.
 */
public class DirectorTest {
  public static void main(String[] args) {
    Subject subject = new Subject();
    Observer observerA = new ConcreteObserverA();
    Observer observerB = new ConcreteObserverB();

    subject.registerObserver(observerA);
    subject.registerObserver(observerB);
    subject.notifyObservers();

    subject.unregisterObserver(observerA);
    subject.notifyObservers();
  }
}
