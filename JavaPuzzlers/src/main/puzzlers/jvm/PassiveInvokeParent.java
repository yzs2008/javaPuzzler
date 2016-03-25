package main.puzzlers.jvm;

/**
 * Created by IntelliJ IDEA.
 * User: kaidi
 * Date: 2016/3/25
 * Time: 21:47
 * Write the code, Change the world.
 */
public class PassiveInvokeParent {
  public static int hoursOfSleep = 8;
  static {
    System.out.println("passive invoke parent class is initialized!");
  }
}
