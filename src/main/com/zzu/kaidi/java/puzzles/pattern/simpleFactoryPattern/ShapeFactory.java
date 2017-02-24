package com.zzu.kaidi.java.puzzles.pattern.simpleFactoryPattern;

/**
 * Created by IntelliJ IDEA.
 * User: kaidi
 * Date: 2016/5/5
 * Time: 16:23
 * Write the code, Change the world.
 */
public class ShapeFactory {
  public Shape getShape(String typeName) {
    if ("Circle".equals(typeName)) {
      return new Circle();
    } else if ("Square".equals(typeName)) {
      return new Square();
    } else if ("Rectangle".equals(typeName)) {
      return new Rectangle();
    } else {
      return null;
    }
  }
}
