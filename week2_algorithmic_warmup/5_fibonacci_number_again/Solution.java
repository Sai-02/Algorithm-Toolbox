import java.io.*;
import java.lang.*;
import java.util.*;

public class Solution {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long n = scanner.nextLong();
    long m = scanner.nextLong();

    long num = n % get_pisano_period(m);
    long fib;
    if (n == 1) {
      fib = 1;
    } else if (n == 0) {
      fib = 0;
    } else {
      long a = 0, b = 1, c = num;
      for (int i = 1; i < num; i++) {
        c = (a + b) % m;
        a = b;
        b = c;
      }
      fib = c;
    }
    long ans = fib % m;
    System.out.println(ans);
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
}
