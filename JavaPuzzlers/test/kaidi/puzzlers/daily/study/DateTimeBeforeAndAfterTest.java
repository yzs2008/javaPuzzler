package kaidi.puzzlers.daily.study;

import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: kaidi
 * Date: 2016/5/5
 * Time: 20:13
 * Write the code, Change the world.
 */
public class DateTimeBeforeAndAfterTest {
  /**
   * 测试日期的before概念
   * before，之前的意思
   */
  @Test
  public void beforeTest() {
    Calendar now = Calendar.getInstance();
    now.set(2016, 5, 5, 20, 16, 0);

    Calendar oneDay = Calendar.getInstance();
    oneDay.set(2016, 5, 4, 00, 36, 0);

    Date dateA = now.getTime();
    Date dateB = oneDay.getTime();

    Assert.assertTrue(dateB.before(dateA));
  }

}
