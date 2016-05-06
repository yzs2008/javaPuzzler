package kaidi.puzzlers.daily.study;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: kaidi
 * Date: 2016/5/5
 * Time: 20:26
 * Write the code, Change the world.
 */
public class DoubleComareZeroTest {

  /**
   * 测试double和0的比较
   * double由于精度问题，尽量避免和0做相等比较，应该使用bigDecimal进行精确值计算
   * 或者引入epsilon（误差范围）做比对！
   */
  @Test
  public void compareDoubleAndZero() {

    double valA = 0.1D;
    double valB = 0.5D;

    for (int i = 0; i < 5; i++) {
      valB -= valA;
    }
    //真值计算应该是0，但是结果不是0
    boolean expectZero = valB == 0.0D;

    Assert.assertFalse(expectZero);
  }

  /**
   * 测试double和zero的比较，可以得到0的情况。
   */
  @Test
  public void compareDoubleAndZeroAnthoerWay() {
    double valA = 0.2;
    double valB = 0.4;
    for (int i = 0; i < 2; i++) {
      valB -= valA;
    }
    boolean expectZero = valB == 0.0D;
    Assert.assertTrue(expectZero);
  }

  @Test
  public void compareDoubleAndZeroWithEpsilon() {

    double valA = 0.1D;
    double valB = 0.5D;

    for (int i = 0; i < 5; i++) {
      valB -= valA;
    }
    //引入epsilon（误差范围）
    boolean expectZero = doubleApproximateZero(valB);

    Assert.assertFalse(expectZero);
  }


  private boolean doubleApproximateZero(double val) {
    //误差范围，自定义
    double epsilon = 0.00000000000001D;
    if (Math.abs(val - 0) < epsilon) {
      return true;
    } else {
      return false;
    }
  }


}
