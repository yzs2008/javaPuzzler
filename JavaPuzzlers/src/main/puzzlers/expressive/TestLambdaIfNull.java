package puzzlers.expressive;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestLambdaIfNull {

  public static void main(String[] args) {
    List<String> testee = null;
    testee = new ArrayList<String>();

    List<String> outCome = testee.stream().filter(s -> s.startsWith("h"))
        .collect(Collectors.toList());
    System.out.println(outCome==null);
    for (String s : outCome) {
      System.out.println(s);
    }
  }
}
