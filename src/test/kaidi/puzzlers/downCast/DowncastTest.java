package kaidi.puzzlers.downCast;

import org.junit.Assert;
import org.junit.Test;
import com.zzu.kaidi.java.puzzles.puzzlers.downCast.Base;
import com.zzu.kaidi.java.puzzles.puzzlers.downCast.Child;

/**
 * Created by kaidi on 2016/6/30.
 */
public class DowncastTest {

    /**
     * 看看是否downcast会返回空，还是会报错
     */
    @Test
    public void testDowncast() {
        Base base = new Base();

        Base child = new Child();

        Child ref = (Child) child;

        Assert.assertNotNull(ref);
        Child ref2;
        try {

            ref2 = (Child) base;
        }catch (ClassCastException e){
            System.out.println("error");
        }


    }
}

