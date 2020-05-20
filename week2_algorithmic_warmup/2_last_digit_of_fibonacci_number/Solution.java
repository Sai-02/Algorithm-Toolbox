import java.util.*;

public class Solution {
    private static int getFibonacciLastDigitNaive(int n) {
        if (n <= 1){
            
            return n;
        }

        int [] fib=new int[n+1];
        int i;
        fib[0]=0;
        fib[1]=1;
        for(i=2;i<n+1;i++){
            fib[i]=fib[i-1]%10 +fib[i-2]%10;
        }
        return fib[n]%10;
        
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = getFibonacciLastDigitNaive(n);
        System.out.println(c);
    }
}
