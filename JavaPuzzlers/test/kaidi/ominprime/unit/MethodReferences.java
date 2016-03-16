package kaidi.ominprime.unit;

import main.ominprime.unit.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: kaidi
 * Date: 2016/3/1
 * Time: 16:50
 * Write the code, Change the world.
 */
public class MethodReferences {


    @Test
    public void testMethodReference() {
        Person[] personAsArray = new Person[5];
        personAsArray[0] = new Person("person1", 1, 22, "living address of shanghai");
        personAsArray[1] = new Person("person1", 2, 32, "living address of beijing");
        personAsArray[2] = new Person("person1", 3, 43, "living address of zhengzhou");
        personAsArray[3] = new Person("person1", 4, 42, "living address of guangzhou");
        personAsArray[4] = new Person("person1", 5, 61, "living address of hangzhou");

        Arrays.sort(personAsArray, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
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


        Arrays.sort(personAsArray, Person::compareAge);
        Assert.assertEquals(personAsArray[0].getAge(), 22);
    }
}

