package main.puzzlers.generic;

import javax.sound.midi.Soundbank;

/**
 * Created by IntelliJ IDEA.
 * User: kaidi
 * Date: 2016/2/19
 * Time: 21:11
 * Write the code, Change the world.
 */

public class RawType {

  public static void main(String[] args) {
    Box<Integer> intBox = new Box<>();
    Box rawBox = new Box();
    rawBox.setVal(1);
    System.out.println(rawBox.getVal().getClass());
    intBox = rawBox;
    System.out.println(intBox.getVal().getClass());
    intBox.setVal(2);
    rawBox = intBox;
    System.out.println(rawBox.getVal().getClass());
  }
}
