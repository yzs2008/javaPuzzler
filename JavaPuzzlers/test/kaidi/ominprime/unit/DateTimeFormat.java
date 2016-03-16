package kaidi.ominprime.unit;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by IntelliJ IDEA.
 * User: kaidi
 * Date: 2016/3/2
 * Time: 15:50
 * Write the code, Change the world.
 */
public class DateTimeFormat {

    @Test
    public void testDateTimeCompare() {
        Date begin = new Date(1456730303000L);
        Date first = new Date(1459440000000L);
        Date second = new Date(1462032000000L);
        Date third = new Date(1464710400000L);
        Date fourth = new Date(1467302400000L);
        Date end = new Date(1456731660041L);

        List<Date> dateList = Stream.of(begin, first, second, third, fourth, end).collect(Collectors.toList());
        SimpleDateFormat formate =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        dateList.stream()
                .map(date-> formate.format(date).toString())
                .forEach(dateText-> System.out.println(dateText));
    }
}
