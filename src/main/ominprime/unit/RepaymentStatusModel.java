package main.ominprime.unit;

/**
 * Created by IntelliJ IDEA.
 * User: kaidi
 * Date: 2016/2/26
 * Time: 20:11
 * Write the code, Change the world.
 */
public class RepaymentStatusModel {
  public static final int NORMAL = 100;
  public static final int DELAYED = 200;
  public static final int CLOSED = 500;
  public static final int CLOSED_INADVANCE = 600;
  /* NONE is the start status of repayment,
   * and is also the default value of repayment,
   * and is also indicated that the transaction of "MoneyTransferred" was just been done.
   */
  public static final int NONE = 0;

  public static Boolean isRepaymentStatus(int status) {
    if (status == NORMAL || status == DELAYED || status == CLOSED || status == CLOSED_INADVANCE) {
      return true;
    }
    return false;
  }

}
