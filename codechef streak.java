// CodeChef Streak
// CodeChef offers a feature called streak count. A streak is maintained if you solve at least one problem daily.
// Om and Addy actively maintain their streaks on CodeChef. Over a span of 
// N
// N consecutive days, you have observed the count of problems solved by each of them.
// Your task is to determine the maximum streak achieved by Om and Addy and find who had the longer maximum streak.

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner kb=new Scanner(System.in);
		int t=kb.nextInt();
		while(t-->0){
		    int n=kb.nextInt();
		    
		    int []arr=new int[n];
		    int maxOm=-1,count=0;
		    for(int i=0;i<arr.length;i++){
		        arr[i]=kb.nextInt();
		        if(arr[i]==0){
		            if(maxOm<count){
		                maxOm=count;
		            }
		            count=0;
		        }
		        else
		          count++;
		    }
		    if(maxOm<count)
		      maxOm=count;
		      
		    int [] brr=new int[n];
		    int maxAddy=-1;
		    count=0;
		    for(int i=0;i<brr.length;i++){
		       brr[i]=kb.nextInt();
		       if(brr[i]==0){
		          if(maxAddy<count)
		            maxAddy=count;
		          count=0;
		       }
		       else
		        count++;
		    }
		    if(maxAddy<count)
		      maxAddy=count;
		      
		    if(maxAddy==maxOm)
		      System.out.println("Draw");
		    else
		      System.out.println(maxAddy>maxOm?"Addy":"Om");
		   
		}
	}
}
