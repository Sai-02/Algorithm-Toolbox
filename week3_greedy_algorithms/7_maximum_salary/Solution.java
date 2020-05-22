import java.io.*;
import java.lang.*;
import java.util.*;

public class Solution {

  private static void largestNumber(String[] a) {
    String result = "";
    for (int i = 0; i < a.length; i++) {
      result += a[i];
    }

    int n = result.length();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      char c = result.charAt(i);
      arr[i] = Integer.parseInt(String.valueOf(c));
    }
    Arrays.sort(arr);
    for (int i = n - 1; i >= 0; i--) {
      System.out.printf("%d", arr[i]);
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    String[] a = new String[n];
    for (int i = 0; i < n; i++) {
      a[i] = scanner.next();
    }
    largestNumber(a);
  }
}
