package com.zzu.kaidi.java.puzzles.pattern.puzzlers.daily.study;

/**
 * Created by kaidi on 2016/8/11.
 */
public class SpaceTest {
    private String memo;
    private String accessor;

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getAccessor() {
        return accessor;
    }

    public void setAccessor(String accessor) {
        this.accessor = accessor;
    }

    public static void main(String[] args) {
        SpaceTest sp1 = new SpaceTest();
        sp1.setAccessor("  accessor  ");
        sp1.setMemo("  memo  ");


        SpaceTest sp2 = new SpaceTest();
        sp2.setAccessor(sp1.getAccessor());
        sp2.setMemo(sp1.getMemo());


    }
}
