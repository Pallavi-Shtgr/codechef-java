// Chef's son wants to go on a roller coaster ride. The height of Chef's son is X inches while the minimum height required to go on the ride is 
// H inches. Determine whether he can go on the ride or not.
// Input Format
// The first line contains a single integer 
// T - the number of test cases. Then the test cases follow. The first and only line of each test case contains two integers X and H - the height of Chef's son and the minimum height required for the ride respectively.



import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0){
		    int x=sc.nextInt();
		    int h=sc.nextInt();
		    if(x>=h){
		        System.out.println("yes");
		    }else{
		        System.out.println("no");
		    }
		    t--;
		}
	}
}
