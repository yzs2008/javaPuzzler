package kaidi.puzzlers.generic;

import com.zzu.kaidi.java.puzzles.puzzlers.generic.BoxModel;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: kaidi
 * Date: 2016/3/10
 * Time: 9:11
 * Write the code, Change the world.
 */
public class GenericTest {

  /**
   * 测试泛型转换，指定类型intBox和原生类型rawBox的转换。
   */
  @Test
  public void testRawType() {
    BoxModel<Integer> intBoxModel = new BoxModel<>();
    BoxModel rawBoxModel = new BoxModel();
    intBoxModel.setVal(2);
    rawBoxModel = intBoxModel;
    Assert.assertEquals(rawBoxModel.getVal(), 2);
  }

  /**
   * 查看指定类型泛型和原生类型的 类型一致性
   */
  @Test
  public void testGenericType() {
    BoxModel<Integer> intBoxModel = new BoxModel<>();
    BoxModel rawBoxModel = new BoxModel();

    intBoxModel = rawBoxModel;
    Assert.assertEquals(rawBoxModel.getClass(), intBoxModel.getClass());
  }

  /**
   * 测试原生类型泛型里面保存的数据，类型为实际类型，而非object
   */
  @Test
  public void testRawTypeValue() {
    BoxModel<Integer> intBoxModel = new BoxModel<>();
    BoxModel rawBoxModel = new BoxModel();

    rawBoxModel.setVal(1);
    Assert.assertNotEquals(rawBoxModel.getVal().getClass(), Object.class);
    Assert.assertEquals(rawBoxModel.getVal().getClass(), Integer.class);

    rawBoxModel.setVal("two");
    Assert.assertEquals(rawBoxModel.getVal().getClass(), String.class);
  }
}
