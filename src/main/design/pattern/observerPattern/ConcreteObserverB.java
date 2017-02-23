package main.design.pattern.observerPattern;

/**
 * Created by IntelliJ IDEA.
 * User: kaidi
 * Date: 2016/5/9
 * Time: 9:24
 * Write the code, Change the world.
 */
public class ConcreteObserverB implements Observer {

  private String name = "I am not the king";

  @Override
  public void getNotify() {
    System.out.println(name);
  }
}
