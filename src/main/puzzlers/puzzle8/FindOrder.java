package puzzlers.puzzle8;

import java.util.ArrayList;
import java.util.List;

public class FindOrder {

  private List<String> origin;

  private List<String> result = new ArrayList<String>();

  private List<ArrayList<Character>> preProcess = new ArrayList<ArrayList<Character>>();

  public List<String> wiseMan() {
    return result;
  }

  private List<String> divide(List<String> source) {
    if (source == null || source.size() == 0) {
      return new ArrayList<String>();
    }

    ArrayList<Character> curOrder = new ArrayList<Character>();

    List<String> next = new ArrayList<String>();

    char flag = '^';
    for (int i = 1; i < source.size(); i++) {

      String pre = source.get(i - 1);
      String item = source.get(i);

      if (item.charAt(0) == pre.charAt(0)) {
        if (pre.charAt(0) != flag) {
          next.add(pre);
        }
        next.add(item);
      } else {
        curOrder.add(flag);
      }

      flag = pre.charAt(0);
    }

    preProcess.add(curOrder);

    return next;
  }

  private List<List<String>> husk(List<String> peanut) {
    char pre = '^';
    List<List<String>> fruit = new ArrayList<List<String>>();
    List<String> apple = new ArrayList<String>();
    for (int i = 0; i < peanut.size(); i++) {
      String item = peanut.get(i);
      if (item.charAt(0) == pre) {
        
      }
    }
    return null;
  }

  private void merge() {
    if (preProcess == null || preProcess.size() == 0) {
      return;
    }
  }

  public FindOrder setSequence(List<String> input) {
    input.add("$");
    origin = input;
    return this;
  }
}
