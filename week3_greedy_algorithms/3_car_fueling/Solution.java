import java.io.*;
import java.lang.*;
import java.util.*;

public class Solution {

  static int computeMinRefills(int dist, int tank, int[] stops, int n) {
    int numRefill = 0, currentRefill = 0;
    while (currentRefill <= n) {
      int lastRefill = currentRefill;
      while (
        currentRefill <= n &&
        (stops[currentRefill + 1] - stops[lastRefill] <= tank)
      ) {
        currentRefill = currentRefill + 1;
      }
      if (currentRefill == lastRefill) {
        return -1;
      }
      if (currentRefill <= n) {
        numRefill = numRefill + 1;
      }
    }
    return numRefill;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int dist = scanner.nextInt();
    int tank = scanner.nextInt();
    int n = scanner.nextInt();
    int stops[] = new int[n + 2];
    for (int i = 1; i <= n; i++) {
      stops[i] = scanner.nextInt();
    }
    stops[0] = 0;
    stops[n + 1] = dist;

    System.out.println(computeMinRefills(dist, tank, stops, n));
  }
}
