package kaidi.puzzlers.daily.study;

/**
 * Created by kaidi on 2016/7/17.
 */
public class StringBuilderTest {
    public static void main(String[] args) {
        String bankCode = "1234567890";
        StringBuilder bankCodeBuilder = new StringBuilder(bankCode);
        bankCodeBuilder.append("0000000000000000", 0, 12 - bankCode.length());
        bankCode = bankCodeBuilder.toString();
        System.out.println(bankCode + ":" + bankCode.length());
    }
}
