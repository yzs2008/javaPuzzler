package main.puzzlers.jvm;

/**
 * Created by IntelliJ IDEA.
 * User: kaidi
 * Date: 2016/3/25
 * Time: 21:47
 * Write the code, Change the world.
 */
public class PassiveInvokeChild extends PassiveInvokeParent{
  static  int hourOfCrying = 10;

  static {
    System.out.println("Passive invoke: child class is initialized!");
  }
}
