package com.zzu.kaidi.java.puzzles.puzzlers.jvm;

/**
 * Created by IntelliJ IDEA.
 * User: kaidi
 * Date: 2016/3/16
 * Time: 9:47
 * Write the code, Change the world.
 */
public class PrivateStaticFieldSynchronize {
  private static boolean continueFlag;
  private static long count=0;


  public static void main(String[] args) throws InterruptedException {
    continueFlag = true;

    Runnable testThead  = ()->{
      int i=0;
      while (continueFlag){
        i++;
        count++;
      }
    };
    Thread theThread = new Thread(testThead);
    theThread.start();

    Thread.sleep(1000L);

    continueFlag = false;
  }
  public static void test() throws InterruptedException {
    continueFlag = true;

    Runnable testThead  = ()->{
      while (continueFlag){
        System.out.println("hello, I am now runing!");
        try {
          Thread.sleep(100L);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    };
    Thread theThread = new Thread(testThead);
    theThread.start();

    Thread.sleep(1000L);

    continueFlag = false;
  }
}
