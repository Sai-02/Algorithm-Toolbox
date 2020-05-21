import java.io.*;
import java.lang.*;
import java.util.*;

public class Solution {

  private static double getOptimalValue(
    int capacity,
    int[] values,
    int[] weights
  ) {
    double value = 0;
    int n = values.length;
    double[] avg = new double[n];
    for (int i = 0; i < n; i++) {
      avg[i] = (double) values[i] / weights[i];
    }
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (avg[j] > avg[j + 1]) {
          continue;
        } else {
          double temp = avg[j];
          avg[j] = avg[j + 1];
          avg[j + 1] = temp;

          int temper = values[j];
          values[j] = values[j + 1];
          values[j + 1] = temper;

          temper = weights[j];
          weights[j] = weights[j + 1];
          weights[j + 1] = temper;
        }
      }
    }
    for (int i = 0; i < n; i++) {
      if (capacity == 0) {
        break;
      } else if (capacity - weights[i] >= 0) {
        // this weight can be picked while
        capacity = capacity - weights[i];
        value = value + (double) avg[i] * weights[i];
      } else {
        // item cant be picked whole
        double fraction = ((double) capacity / (double) weights[i]);
        value += (avg[i] * weights[i] * fraction);
        capacity = (int) (capacity - weights[i] * fraction);
      }
    }

    return value;
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int capacity = scanner.nextInt();
    int[] values = new int[n];
    int[] weights = new int[n];
    for (int i = 0; i < n; i++) {
      values[i] = scanner.nextInt();
      weights[i] = scanner.nextInt();
    }
    System.out.println(getOptimalValue(capacity, values, weights));
  }
}
