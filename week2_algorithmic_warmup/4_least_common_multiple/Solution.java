import java.util.*;

public class Solution {

  //
  public static long gcd(long a, long b) {
    if (a == 0) return b;

    return gcd(b % a, a);
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    long a = scanner.nextLong();
    long b = scanner.nextLong();
    long gcd = gcd(a, b);
    long lcm = (a * b) / gcd;
    System.out.println(lcm);
  }
}
