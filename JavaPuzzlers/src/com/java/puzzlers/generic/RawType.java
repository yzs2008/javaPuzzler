package com.java.puzzlers.generic;

import javax.sound.midi.Soundbank;

/**
 * Created by DELL on 2016/2/19.
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
