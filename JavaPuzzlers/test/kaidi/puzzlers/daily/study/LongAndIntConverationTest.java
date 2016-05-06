package kaidi.puzzlers.daily.study;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: kaidi
 * Date: 2016/5/6
 * Time: 14:45
 * Write the code, Change the world.
 */
public class LongAndIntConverationTest {
  /**
   * 直接使用数值常量计算，表达式默认是int值，即使int会溢出，也不会主动转换为long
   * 解决方案是，在其中的一个数值常量后加l，或者在所有的数值常量后加l
   */
  @Test
  public void longAndIntConveration() {
    //the computation is performed entirely in integer arithmetic
    //and actually overflow.
    final long micro_per_day = 24 * 60 * 60 * 1000 * 1000;//一天的微秒数,结果有溢出，所以不是正确的结果，但是无运行时异常！
    //to fix the problem, use L to suffix the integer, just one is enough
    final long micro_per_day_fixed = 24 * 60 * 60 * 1000 * 1000L;//一天的微秒数，正确的结果

    final long millis_per_day = 24 * 60 * 60 * 1000;//一天的毫秒数

    //毫秒与微秒的级数，正确值为1000
    long serie = micro_per_day / millis_per_day;
    long serie_fixed = micro_per_day_fixed / millis_per_day;

    Assert.assertNotEquals(serie, 1000);
    Assert.assertEquals(serie_fixed, 1000);

  }
}
