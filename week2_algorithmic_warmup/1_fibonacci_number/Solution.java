import java.io.*;
import java.lang.*;
import java.util.*;

public class Solution {

  public static void main(String[] args) throws java.lang.Exception {
    Scanner in = new Scanner(System.in);
    int i;
    int n = in.nextInt();
    if (n >= 2) {
      int[] fib = new int[n + 1];
      fib[0] = 0;
      fib[1] = 1;

      for (i = 2; i < n + 1; i++) {
        fib[i] = fib[i - 1] + fib[i - 2];
      }
      System.out.printf("%d", fib[n]);
    } else {
      if (n == 0) {
        System.out.println("0");
      }
      if (n == 1) {
        System.out.println("1");
      }
    }
  }
}
