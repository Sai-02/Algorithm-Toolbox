import java.util.*;

public class Solution {

  private static long lcm_naive(int a, int b) {
    long lcm = 1;
    if (a > b) {
      int temp = b;
      b = a;
      a = temp;
    }
    for (long l = 1; l <= (long) a * b; l++) {
      lcm = a * l;
      if (lcm % a == 0 && lcm % b == 0) {
        return lcm;
      }
    }

    return (long) a * b;
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(lcm_naive(a, b));
  }
}
