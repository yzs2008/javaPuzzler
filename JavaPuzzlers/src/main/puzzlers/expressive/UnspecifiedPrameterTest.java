package puzzlers.expressive;

public class UnspecifiedPrameterTest {

  public static void main(String[] args) {
    String format="我要申请%d元 分%d期 已取消 ";
    System.out.println(formatStr(format,100,1000));

    format="我要买%s 申请%d元 分%d期 %s";
    System.out.println(formatStr(format,"apple",100,1000,"thank"));
    
    
    format="第%d期 %s元 %s ";
    System.out.println(formatStr(format,100,1000,"nice"));
  }

  public static String formatStr(String format,Object... args){
    return String.format(format, args);
  }
}
