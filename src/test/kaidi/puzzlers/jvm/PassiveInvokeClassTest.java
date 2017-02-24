package kaidi.puzzlers.jvm;

import com.zzu.kaidi.java.puzzles.pattern.puzzlers.jvm.PassiveInvokeChild;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: kaidi
 * Date: 2016/3/25
 * Time: 21:50
 * Write the code, Change the world.
 */
public class PassiveInvokeClassTest {
  /**
   * A use of a non-constant field is an active use of only the class or
   * interface that actually declares the field. For example, a field declared
   * in a class may be referred to via a subclass. A field declared in an
   * interface may be referred to via a subinterface or class that implements
   * the interface. These are passive uses of the subclass, subinterface, or
   * class that implements the interface--uses that wonít trigger their
   * initialization. They are an active use only of the class or interface in
   * which the field is actually declared. Here is an example that illustrates
   * this principle:
   */
  @Test
  public void testPassiveInvoke() {
    int hours = PassiveInvokeChild.hoursOfSleep;
    System.out.println("hours of sleep is: " + hours);
    Assert.assertTrue(true);
  }

}
