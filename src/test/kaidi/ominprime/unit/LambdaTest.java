package kaidi.ominprime.unit;

import com.zzu.kaidi.java.puzzles.pattern.unit.ApplicationModel;
import com.zzu.kaidi.java.puzzles.pattern.unit.RepaymentStatusModel;
import org.junit.Assert;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by IntelliJ IDEA.
 * User: kaidi
 * Date: 2016/2/24
 * Time: 21:11
 * Write the code, Change the world.
 */
public class LambdaTest {

  /**
   * lambda 表达式，boxed（）可以快速创建一个list对象。
   */
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

  /**
   * lambda 表达式中 partitioningBy()可以实现对列表的分割.
   */
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
    Assert.assertEquals(gt100List, result.get(true));
    Assert.assertEquals(lt100List, result.get(false));
  }

  /**
   * lambda 表达式 “::”可以调用静态函数引用。
   */
  public void testFunctionReference() {
    List<Integer> integerList = IntStream.of(10, 30, 40, 100, 200, 500, 600)
                                         .boxed()
                                         .collect(Collectors.toList());
    Map<Boolean, List<Integer>> result = integerList.stream()
                                                    .collect(Collectors.partitioningBy(RepaymentStatusModel::isRepaymentStatus));
    List<Integer> lt100List = IntStream.of(10, 30, 40)
                                       .boxed()
                                       .collect(Collectors.toList());
    List<Integer> gt100List = IntStream.of(100, 200, 500, 600)
                                       .boxed()
                                       .collect(Collectors.toList());
    Assert.assertEquals(gt100List, result.get(true));
    Assert.assertEquals(lt100List, result.get(false));
  }

  /**
   * lambda 表达式 map（）可以遍历list，生成其他对象返回。
   */
  @Test
  public void testMap() {
    List<ApplicationModel> appList = new ArrayList<>();
    appList.add(new ApplicationModel("normal", 100, 100));
    appList.add(new ApplicationModel("delay", 200, 100));
    appList.add(new ApplicationModel("over", 500, 100));
    appList.add(new ApplicationModel("prePay", 600, 100));
    appList.add(new ApplicationModel("normal", 100, 100));
    appList.add(new ApplicationModel("wait for check", 0, 30));
    appList.add(new ApplicationModel("deny", 0, 40));
    appList.add(new ApplicationModel("canceled by system", 0, 1000));

    long count = appList.stream()
                        .filter((app) -> app.getRepaymentStatus() >= 100)
                        .count();
    Assert.assertEquals(count, 5);

    List<ApplicationModel> result = appList.stream()
                                           .filter(app -> app.getStatus() >= 100 && app.getStatus() != 1000)
                                           .map((app) -> {
                                             if (app.getRepaymentStatus() >= 100) {
                                               app.setStatus(app.getRepaymentStatus());
                                             }
                                             return app;
                                           })
                                           .collect(Collectors.toList());

    result.stream().forEach(app -> System.out.println(app.toString()));
    Assert.assertEquals(result.get(1).getStatus(), 200);
  }

  /**
   * lambda 表达式 foreach()，可以遍历list中的元素。
   */
  @Test
  public void testDateTimeCompare() {
    Date begin = new Date(1456730303000L);
    Date first = new Date(1459440000000L);
    Date second = new Date(1462032000000L);
    Date third = new Date(1464710400000L);
    Date fourth = new Date(1467302400000L);
    Date end = new Date(1456731660041L);

    List<Date> dateList = Stream.of(begin, first, second, third, fourth, end).collect(Collectors.toList());
    SimpleDateFormat formate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    dateList.stream()
            .map(date -> formate.format(date).toString())
            .forEach(dateText -> System.out.println(dateText));

    Assert.assertTrue(true);
  }

  /**
   * collector操作，不会返回null
   * 如果没有匹配的元素，返回一个empty list对象
   */
  @Test
  public void testCollectReturn() {
    //测试对象为空
    List<String> testee = new ArrayList<String>();

    //不会匹配到任何元素
    List<String> outCome = testee.stream().filter(s -> s.startsWith("null"))
                                 .collect(Collectors.toList());
    Assert.assertNotNull(outCome);
  }
}

