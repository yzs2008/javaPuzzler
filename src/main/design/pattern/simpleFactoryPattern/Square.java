package main.design.pattern.simpleFactoryPattern;

/**
 * Created by IntelliJ IDEA.
 * User: kaidi
 * Date: 2016/5/5
 * Time: 16:23
 * Write the code, Change the world.
 */
public class Square implements  Shape{
  @Override
  public void draw() {
    System.out.println("this is a shape of square.");
  }
}
