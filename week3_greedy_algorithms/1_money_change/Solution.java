import java.io.*;
import java.lang.*;
import java.util.*;

public class Solution {

  private static int getChange(int m) {
    int count = 0;
    for (;;) {
      if (m >= 10) {
        m = m - 10;
        count++;
      } else if (m >= 5) {
        m = m - 5;
        count++;
      } else if (m >= 1) {
        m = m - 1;
        count++;
      } else {
        break;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int m = scanner.nextInt();
    System.out.println(getChange(m));
  }
}
