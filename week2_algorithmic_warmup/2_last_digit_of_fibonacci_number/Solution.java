import java.util.*;
import java.math.*; 
import java.io.*; 

 class Solution {
    private static BigInteger getFibonacciLastDigitNaive(int n) {
        if (n== 1){
           BigInteger num=BigInteger.valueOf(1);
           return num;
            // return n
        }
        
                if (n==0){
           BigInteger num=BigInteger.valueOf(0);
           return num;
            // return n
        }
        
                if (n<0){
           BigInteger num=BigInteger.valueOf(-1);
           return num;
            // return n
        }
              

        BigInteger previous =BigInteger.valueOf(0);
        BigInteger current  = BigInteger.valueOf(1);
        BigInteger div=BigInteger.valueOf(10);

        for (int i = 0; i < n - 1; ++i) {
            BigInteger tmp_previous=BigInteger.valueOf(0);
            tmp_previous = previous;
            previous = current;
            current = (tmp_previous.add(current));
        }

        return current.mod(div);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        BigInteger c = getFibonacciLastDigitNaive(n);
        System.out.println(c);
    }
}

