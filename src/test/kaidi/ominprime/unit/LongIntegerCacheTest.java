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

public class LongIntegerCacheTest {
  /**
   * 缓存的数字比较：在-128到127之间，java虚拟机会缓存该对象，所以比较引用时会返回true。
   * 该情况只存在于对象间，原生数值比较不会出现这种情况。
   * 在java1.6的源码中可以找到原因
   * public static Integer valueOf(int i) {
   * if(i >= -128 && i <= IntegerCache.high)
   * return IntegerCache.cache[i + 128];
   * else
   * return new Integer(i);
   * }
   */
  @Test
  public void testLongCache() {
    Long first127 = 127L;
    Long second127 = 127L;
    Assert.assertTrue(first127 == second127);

    Long first128 = 128L;
    Long second128 = 128L;
    Assert.assertFalse(first128 == second128);

    Long first_128 = -128L;
    Long second_128 = -128L;
    Assert.assertTrue(first_128 == second_128);

    Long first0 = 0L;
    Long second0 = 0L;
    Assert.assertTrue(first0 == second0);
  }


  @Test
  public void testIntCache() {
    Integer first127 = 127;
    Integer second127 = 127;
    Assert.assertTrue(first127 == second127);

    Integer first128 = 128;
    Integer second128 = 128;
    Assert.assertFalse(first128 == second128);

    Integer first_128 = -128;
    Integer second_128 = -128;
    Assert.assertTrue(first_128 == second_128);

    Integer first0 = 0;
    Integer second0 = 0;
    Assert.assertTrue(first0 == second0);

  }

}
