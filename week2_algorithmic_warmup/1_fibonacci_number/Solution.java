/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Solution
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner in = new Scanner(System.in);
		 int i;
               int n = in.nextInt();
               int []fib=new int[n+1];
               fib[0]=0;
               fib[1]=1;
               fib[2]=1;
               for(i=3;i<n+1;i++){
                   fib[i]=fib[i-1]+fib[i-2];
               }
              System.out.printf("%d",fib[n]);

   
  }
}
