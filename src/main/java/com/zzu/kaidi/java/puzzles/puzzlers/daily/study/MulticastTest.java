package com.zzu.kaidi.java.puzzles.puzzlers.daily.study;

/**
 * @author kaidi
 */
public class MulticastTest {

  public static void main(String[] args) {
    /**
     * the cast rule: Sign extension is performed if the type of the original value is signed.
     * zero extension if it is a char, regardless of the the type to which it is being converted.
     *
     * first -1 is an integer 32bit. 0xffff
     * then cast to byte 8bit. 0xf
     * then cast to char 16bit. 0xff
     * then cast to integer 32bit. 0x00ff
     * the result is 0x00ff=65535
     */

    System.out.println((int) (char) (byte) -1);
    System.out.println((byte) -1);
    System.out.println((char) (byte) -1);

  }

}
