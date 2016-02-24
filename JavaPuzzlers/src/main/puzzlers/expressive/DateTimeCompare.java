package puzzlers.expressive;

import java.util.Date;

public class DateTimeCompare {

  public static void main(String[] args) {
    Date dtA = new Date(2015, 10, 12);
    Date dtB = new Date(2015, 11, 12);

    System.out.println(dtA.before(dtB));
  }
}
