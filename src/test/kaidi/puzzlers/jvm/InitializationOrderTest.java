package kaidi.puzzlers.jvm;

import com.zzu.kaidi.java.puzzles.puzzlers.jvm.InitializationOrder;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: kaidi
 * Date: 2016/3/12
 * Time: 14:20
 * Write the code, Change the world.
 */
public class InitializationOrderTest {
  @Test
  public void testInitializationOrder() {
    InitializationOrder order = new InitializationOrder();
    order.fun();
    Assert.assertTrue(1 == 1);
  }

}
