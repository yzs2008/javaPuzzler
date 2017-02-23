package main.design.pattern.simpleFactoryPattern;

/**
 * Created by IntelliJ IDEA.
 * User: kaidi
 * Date: 2016/5/5
 * Time: 16:22
 * Write the code, Change the world.
 */
public class DirectorTest {
  public static void main(String[] args) {
    ShapeFactory factory = new ShapeFactory();
    Shape rectangle, square, circle;
    rectangle = factory.getShape("Rectangle");
    rectangle.draw();
    square = factory.getShape("Square");
    square.draw();
    circle = factory.getShape("Circle");
    circle.draw();
  }
}
