package puzzlers.expressive;

import java.text.DateFormat;
import java.util.Date;

public class GsonDateParser {

  public static void main(String[] args) {
    Long dateLongVal = 1447145353000L;
    String json="{\"date\":1447145353000}";
    Date shouldBe=new Date(dateLongVal);
    System.out.println(shouldBe);

//    Gson gson=new GsonBuilder().setDateFormat(DateFormat.MILLISECOND_FIELD).create();
//    String toJson=gson.toJson(shouldBe);
//    System.out.println(toJson);
    //Date date= gson.fromJson(json, Date.class);
    //System.out.println(date);
  }

}
