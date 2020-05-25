import java.io.*;
import java.lang.*;
import java.util.*;

public class Solution {

  private static int getMajorityElement(int[] a) {
    Arrays.sort(a);
    int n = a.length;
    // if (left == right) {
    //             return -1;
    //         }
    //         if (left + 1 == right) {
    //             return a[left];
    //         }
    //         //write your code here
    //         return -1;
    int mid = n / 2;
    if (n % 2 == 0) {
      if (a[0] == a[mid] || a[mid] == a[n - 1]) {
        return 1;
      } else {
        return 0;
      }
    } else {
      if (a[0] == a[mid + 1] || a[mid - 1] == a[n - 1]) {
        return 1;
      } else {
        return 0;
      }
    }
  }

  public static void main(String[] args) {
    FastScanner scanner = new FastScanner(System.in);
    int n = scanner.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = scanner.nextInt();
    }
    int result = getMajorityElement(a);
    System.out.println(result);
  }

  static class FastScanner {
    BufferedReader br;
    StringTokenizer st;

    FastScanner(InputStream stream) {
      try {
        br = new BufferedReader(new InputStreamReader(stream));
      } catch (Exception e) {
        e.printStackTrace();
      }
    }

    String next() {
      while (st == null || !st.hasMoreTokens()) {
        try {
          st = new StringTokenizer(br.readLine());
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      return st.nextToken();
    }

    int nextInt() {
      return Integer.parseInt(next());
    }
  }
}
