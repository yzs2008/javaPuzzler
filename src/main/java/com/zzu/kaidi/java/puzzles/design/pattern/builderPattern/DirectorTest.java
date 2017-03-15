package com.zzu.kaidi.java.puzzles.design.pattern.builderPattern;

/**
 * Created by IntelliJ IDEA.
 * User: kaidi
 * Date: 2016/5/5
 * Time: 9:14
 * Write the code, Change the world.
 */
public class DirectorTest {
  public static void main(String[] args) {
    System.out.println("I am the test demo of builderPattern!");

    Builder builder = new ConcreteBuilder();
    builder.setAge(20).setName("yzs").setSomethingImportant("yzs is very important");
    Product productYzs = builder.create();

    builder.setAge(20).setName("wxl").setSomethingImportant("wxl is very important");
    Product productWxl = builder.create();

    System.out.println(productYzs.toString());
    System.out.println(productWxl.toString());

  }
}
