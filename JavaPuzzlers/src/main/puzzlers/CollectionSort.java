package puzzlers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class CollectionSort {

  public static void main(String[] args) {
    List<ItemClass> origin = new ArrayList<ItemClass>();
    for (int i = 0; i < 10; i++) {
      ItemClass item = new ItemClass();
      item.time = new Date(System.currentTimeMillis() - i * 1000L);
      item.type = i;
      item.message = "this is item " + i;
      origin.add(item);
    }
    System.out.println("-----------");
    Collections.sort(origin, new Comparator<ItemClass>() {
      @Override
      public int compare(ItemClass arg0, ItemClass arg1) {
        return arg0.time.compareTo(arg1.time);
      }
    });

    System.out.println("-----------");
    Collections.sort(origin, new Comparator<ItemClass>() {
      @Override
      public int compare(ItemClass arg0, ItemClass arg1) {
        return arg0.time.compareTo(arg1.time) * -1;
      }
    });
    System.out.println("-----------");
  }
}

class ItemClass {
  public int type;
  public Date time;
  public String message;
}
