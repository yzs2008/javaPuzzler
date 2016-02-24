package puzzlers.expressive;

import java.util.Collections;
import java.util.List;

public class TestEmptyList {

  public static void main(String[] args){
    List list=Collections.EMPTY_LIST;
    System.out.println(list == null);
    System.out.println(list.size());
  }
}
