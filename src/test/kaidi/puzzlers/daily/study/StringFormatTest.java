package kaidi.puzzlers.daily.study;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by kaidi on 2016/6/20.
 */
public class StringFormatTest {
    @Test
    public void testStringFormat() {

        int length = 5;
        int rtn = 123456;

        String format = "%0" + length + "d";
        String result =  String.format(format, rtn);

        String expect = "12345";


        Assert.assertEquals(expect,result);

        rtn = 21;
        result = String.format(format, rtn);
        Assert.assertEquals("00021",result);

    }
}
