package puzzlers.expressive;

import javax.sound.midi.Soundbank;

/**
 * Created by DELL on 2016/2/24.
 */
public class TestEqual {
  public static void main(String[] args) {
    Integer length = null;

    length = length == null ? 0 : length;
    System.out.println(length);

    length = 1;
    length = length == null ? 0 : length;
    System.out.println(length);
  }
}
