import java.io.*;
import java.lang.*;
import java.util.*;

public class Solution {

  private static long getFibonacci(long n) {
    if (n <= 1) return n;

    long previous = 0;
    long current = 1;
    long sum = 1;

    for (long i = 0; i < n - 1; ++i) {
      long tmp_previous = previous;
      previous = current;
      current = (tmp_previous + current) % 10;
    }
    return current;
  }

  public static long get_pisano_period(long m) {
    long a = 0, b = 1, c = a + b;
    long i = 0;
    for (i = 0; i < m * m; i++) {
      c = (a + b) % m;
      a = b;
      b = c;
      if (a == 0 && b == 1) {
        break;
      }
    }
    return i + 1L;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long n = scanner.nextLong();
    long s = get_pisano_period(10);
    n = n % s;
    long num1 = getFibonacci(n);
    long num2 = getFibonacci(n + 1);
    long ans = num1 * num2;
    ans = ans % 10;
    System.out.println(ans);
  }
}
