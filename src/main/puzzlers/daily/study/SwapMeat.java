package main.puzzlers.daily.study;

/**
 * @author kaidi
 *         <p>
 *         through the list way, you can swap two value but need no more temporary.
 *         x=x^y;
 *         y=y^x;
 *         x=y^x;
 *         <p>
 *         operands of operators are evaluated from left to right in java.
 */
public class SwapMeat {
  public static void main(String[] args) {
    int x = 1984;//0x7c0
    int y = 2001;//0x7d1
    x ^= y ^= x ^= y;
    System.out.println("x=" + x + ";y=" + y);
  }

}
