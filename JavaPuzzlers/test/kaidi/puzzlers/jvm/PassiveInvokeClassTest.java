package kaidi.puzzlers.jvm;

import main.puzzlers.jvm.PassiveInvokeChild;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

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
   interface that actually declares the field. For example, a field declared
   in a class may be referred to via a subclass. A field declared in an
   interface may be referred to via a subinterface or class that implements
   the interface. These are passive uses of the subclass, subinterface, or
   class that implements the interface--uses that wonít trigger their
   initialization. They are an active use only of the class or interface in
   which the field is actually declared. Here is an example that illustrates
   this principle:
   */
  @Test
  public void testPassiveInvoke() {
    int hours = PassiveInvokeChild.hoursOfSleep;
    System.out.println("hours of sleep is: " + hours);
    Assert.assertTrue(true);
  }

  /**
   ** test for expression resolve.
   **/
  @Test
  public void testExpressionResolve() {
    String express = "(A*2+B+C+D+E+F-(A+B+C+D)/4)/6";
    Map<String,Double> judgeMapForTest = new HashMap();
    judgeMapForTest.put("A",87.8);
    judgeMapForTest.put("B",76.6);
    judgeMapForTest.put("C",84.7);
    judgeMapForTest.put("D",65.2);
    judgeMapForTest.put("E",90.7);
    judgeMapForTest.put("F",86.8);
    String intermidate = ExpressionResolve.preProcess(express);
    Double result = ExpressionResolve.resolve(intermidate);
    Assert.assertEquals(result, new Double(83.50417));
  }
}
