package kaidi.ominprime.unit;

import kaidi.base.MockTest;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.BooleanSupplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by IntelliJ IDEA.
 * User: kaidi
 * Date: 2016/2/24
 * Time: 21:11
 * Write the code, Change the world.
 */
public class Lambda extends MockTest {

  @Test
  public void testIntStream() {
    List<Integer> integerList = IntStream.of(10, 30, 40, 100, 200, 500, 600)
                                        .boxed()
                                        .collect(Collectors.toList());
    List<Integer> originList = new ArrayList<>();
    originList.add(10);
    originList.add(30);
    originList.add(40);
    originList.add(100);
    originList.add(200);
    originList.add(500);
    originList.add(600);

    Assert.assertEquals(originList, integerList);
  }

  @Test
  public void testStreamPartitionBy() {
    List<Integer> integerList = IntStream.of(10, 30, 40, 100, 200, 500, 600)
                                        .boxed()
                                        .collect(Collectors.toList());
    Map<Boolean, List<Integer>> result = integerList.stream().collect(Collectors.partitioningBy(x -> x >= 100));
    List<Integer> lt100List = IntStream.of(10, 30, 40)
                                      .boxed()
                                      .collect(Collectors.toList());
    List<Integer> gt100List = IntStream.of(100, 200, 500, 600)
                                      .boxed()
                                      .collect(Collectors.toList());
    Assert.assertEquals(gt100List,result.get(true));
    Assert.assertEquals(lt100List,result.get(false));
  }
}

