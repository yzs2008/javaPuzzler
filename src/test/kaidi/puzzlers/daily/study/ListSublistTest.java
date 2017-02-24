package kaidi.puzzlers.daily.study;


import org.junit.Assert;
import org.junit.Test;
import com.zzu.kaidi.java.puzzles.pattern.puzzlers.downCast.Child;

import java.util.ArrayList;
import java.util.List;

public class ListSublistTest {

    @Test
    public void sublistTest() {

        int batchCount = 500;

        List<Child> children = helpConstructList(500);

        List<List<Child>> result = new ArrayList<>();

        int total = children.size();
        for (int i = 0; i < total; i += batchCount) {
            int start = i;
            int end = (i + batchCount) > total ? total : (i + batchCount);

            List<Child> batchList = children.subList(start, end);
            result.add(batchList);
        }

        Assert.assertTrue(result.size() < total);
    }

    private List<Child> helpConstructList(int count) {
        List<Child> children = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            children.add(new Child(String.valueOf("test" + i)));
        }
        return children;
    }
}
