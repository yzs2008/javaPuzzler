package main.puzzlers.jvm;

/**
 * Created by IntelliJ IDEA.
 * User: kaidi
 * Date: 2016/3/12
 * Time: 14:21
 * Write the code, Change the world.
 */
public class InitializationOrder {

  InnerInitialization first = new InnerInitialization(1);

  public InitializationOrder() {
    System.out.println("InitializationOrder object constructor function run.");
    second = new InnerInitialization(2);
  }

  InnerInitialization second = new InnerInitialization(2);

  public void fun() {
    System.out.println("InitializationOrder method run.");
  }

  InnerInitialization third = new InnerInitialization(3);

}

class InnerInitialization {
  InnerInitialization(int input) {
    System.out.println("Initialize InnerInitialization object with " + input);
  }
}
