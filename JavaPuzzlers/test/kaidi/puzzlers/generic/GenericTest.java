package kaidi.puzzlers.generic;

import kaidi.base.MockTest;
import main.puzzlers.generic.Box;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: kaidi
 * Date: 2016/3/10
 * Time: 9:11
 * Write the code, Change the world.
 */
public class GenericTest extends MockTest {
  Box<Integer> intBox;
  Box rawBox;

  @Before
  public void initThisClass() {
    intBox = new Box<>();
    rawBox = new Box();
  }

  @Test
  public void testRawType() {
    intBox.setVal(2);
    rawBox = intBox;
    Assert.assertEquals(rawBox.getVal(), 2);
  }

  public void testGenericType() {
    intBox = rawBox;
    Assert.assertEquals(rawBox.getClass(), intBox.getClass());
  }

  public void testRawTypeValue() {
    rawBox.setVal(1);
    Assert.assertEquals(rawBox.getVal().getClass(), Object.class);
  }
}
