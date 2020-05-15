/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Solution
{
static long getMaxPairwiseProduct(int[] number) {
        int max_product = 0;
        int n = number.length;
        // System.out.println(n);

      /*  for (int first = 0; first < n; ++first) {
            for (int second = first + 1; second < n; ++second) {
                max_product = Math.max(max_product,
                    numbers[first] * numbers[second]);
            }
        }*/
        // if(n==2){
        //     return number[1]*number[0];
        // }
        // else{
        
        for(int i=0;i<n-1;i++){          
           if(number[i]<number[i+1]){
               continue;
            }
           else{
               int temp=number[i+1];
               number[i+1]=number[i];
               number[i]=temp;
           }
        }
        
                for(int i=0;i<n-2;i++){          
           if(number[i]<number[i+1]){
               continue;
            }
           else{
               int temp=number[i+1];
               number[i+1]=number[i];
               number[i]=temp;
           }
        }

        return (long)number[n-2]*number[n-1];
    }


    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
      
            
        System.out.println(getMaxPairwiseProduct(numbers));
        
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new
                    InputStreamReader(stream));
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


