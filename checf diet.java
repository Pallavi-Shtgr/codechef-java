// Chef decided to go on a diet during the following N days (numbered 1 through N). Part of the diet plan is to eat K grams of protein during each day. For each valid i, Chef wants to buy 
// A i grams of protein in the morning of the i-th day and then eat 
// K grams of protein as part of his dinner. If he has any protein remaining, he can store it and use it in later dinners. Initially, Chef is storing 0 grams of protein.

// Determine whether Chef will have enough protein all the time during his diet. In case he will not have enough, find the first day on which Chef will be unable to eat 
// K grams of protein.

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner read = new Scanner(System.in);
	    int t = read.nextInt();
	    for(int i=0; i<t; i++){
	        int n = read.nextInt();
	        int k = read.nextInt();
	        int[] a = new int[n];
	        for(int j=0; j<n; j++){
	            int ele = read.nextInt();
	            a[j] = ele;
	        }
	        int x = 0;
	        int count = 0;
	        for(int j=0; j<n; j++){
	            if(a[j] >= k){
	                x = x + (a[j] - k);
	                count = count + 0;
	            }
	            else{
	                if((a[j] + x) >= k){
	                    x = x - (k - a[j]);
	                    count = count + 0;
	                }
	                else{
	                    System.out.println("NO " + (j+1));
	                    count = count + 1;
	                    break;
	                }
	            }
	        }
	        if(count == 0){
	            System.out.println("YES");
	        }
	    }
	}
}