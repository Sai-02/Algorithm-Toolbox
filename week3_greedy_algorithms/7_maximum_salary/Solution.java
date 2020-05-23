import java.io.*;
import java.lang.*;
import java.util.*;

public class Solution {

  private static String largestNumber(String[] a) {
    int n = a.length;
    int i, j;
    for (i = 0; i < n - 1; i++) {
      for (j = 0; j < n - 1 - i; j++) {
        int ans1 = Integer.parseInt(a[j] + a[j + 1]);
        int ans2 = Integer.parseInt(a[j + 1] + a[j]);
        if (ans1 > ans2) {
          continue;
        } else {
          String temp = a[j];
          a[j] = a[j + 1];
          a[j + 1] = temp;
        }
      }
    }
    String result = "";
    for (i = 0; i < n; i++) {
      result += a[i];
    }
    return result;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    String[] a = new String[n];
    for (int i = 0; i < n; i++) {
      a[i] = scanner.next();
    }
    System.out.println(largestNumber(a));
  }
}
