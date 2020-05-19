import java.math.*;
import java.util.*;

public class Solution {

  private static int getFibonacciLastDigitNaive(int n) {
    if (n <= 1) return n;

    BigInteger previous = BigInteger.valueOf(0);
    BigInteger current = BigInteger.valueOf(1);

    for (int i = 2; i < n + 1; i++) {
      BigInteger tmp_previous = BigInteger.valueOf(0);
      tmp_previous = previous;
      previous = current;
      current = tmp_previous.add(current);
    }

    BigInteger Ten = BigInteger.valueOf(10);
    int r = (current.mod(Ten)).intValue();
    return r;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int c = getFibonacciLastDigitNaive(n);
    System.out.println(c);
  }
}
