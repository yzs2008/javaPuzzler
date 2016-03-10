package kaidi.ominprime.unit;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: kaidi
 * Date: 2016/3/10
 * Time: 16:11
 * Write the code, Change the world.
 */
public class LongCacheTest {
  @Test
  public void testLongCache127() {
    Long longVal = 127L;
    Long longVal2 = 127L;
    Assert.assertTrue(longVal == longVal2);
  }

  @Test
  public void testLongCache128() {
    Long longVal = 128L;
    Long longVal2 = 128L;
    Assert.assertTrue(longVal == longVal2);
  }

  @Test
  public void testLongWithInt() {
    Long longVal = 128L;
    int intVal = 128;
    Assert.assertTrue(longVal == intVal);
  }

}
