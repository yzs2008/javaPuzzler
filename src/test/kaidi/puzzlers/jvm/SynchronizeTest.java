package kaidi.puzzlers.jvm;

import main.puzzlers.jvm.PrivateStaticFieldSynchronize;
import main.puzzlers.jvm.PublicStaticFieldSynchronize;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: kaidi
 * Date: 2016/3/16
 * Time: 10:03
 * Write the code, Change the world.
 */
public class SynchronizeTest {
  @Test
  public void testPrivateStaticFieldSynchronize() throws InterruptedException {
    PrivateStaticFieldSynchronize privateField = new PrivateStaticFieldSynchronize();
    privateField.test();
    Assert.assertTrue(true);
  }

  @Test
  public  void  testPublicStaticFieldSynchronize() throws InterruptedException {
    PublicStaticFieldSynchronize publicField =new PublicStaticFieldSynchronize();
    publicField.test();
    Assert.assertTrue(true);
  }
}
