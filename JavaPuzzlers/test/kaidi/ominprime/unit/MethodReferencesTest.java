package kaidi.ominprime.unit;

import main.ominprime.unit.PersonModel;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by IntelliJ IDEA.
 * User: kaidi
 * Date: 2016/3/1
 * Time: 16:50
 * Write the code, Change the world.
 */
public class MethodReferencesTest {


  /**
   * 测试函数接口，lambda表达式，函数引用三者的功能（相等）
   */
  @Test
  public void testMethodReference() {
    PersonModel[] personAsArray = new PersonModel[5];
    personAsArray[0] = new PersonModel("person1", 1, 22, "living address of shanghai");
    personAsArray[1] = new PersonModel("person2", 2, 32, "living address of beijing");
    personAsArray[2] = new PersonModel("person3", 3, 43, "living address of zhengzhou");
    personAsArray[3] = new PersonModel("person4", 4, 42, "living address of guangzhou");
    personAsArray[4] = new PersonModel("person5", 5, 61, "living address of hangzhou");

    Arrays.sort(personAsArray, new Comparator<PersonModel>() {
      @Override
      public int compare(PersonModel o1, PersonModel o2) {
        if (o1.getAge() > o2.getAge()) {
          return 1;
        }
        if (o1.getAge() == o2.getAge()) {
          return 0;
        }
        return -1;
      }
    });

    Assert.assertEquals(personAsArray[0].getAge(), 22);


    Arrays.sort(personAsArray, (o1, o2) -> {
      if (o1.getAge() > o2.getAge()) {
        return -1;
      }
      if (o1.getAge() == o2.getAge()) {
        return 0;
      }
      return 1;
    });

    Assert.assertEquals(personAsArray[0].getAge(), 61);


    Arrays.sort(personAsArray, PersonModel::compareAge);
    Assert.assertEquals(personAsArray[0].getAge(), 22);
  }
}

