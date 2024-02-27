// Chef and Brain Speed
// In ChefLand, human brain speed is measured in bits per second (bps). Chef has a threshold limit of X bits per second above which his calculations are prone to errors. If Chef is currently working at 
// Y bits per second, is he prone to errors?If Chef is prone to errors print YES, otherwise print NO.
// Input Format
// The only line of input contains two space separated integers X and Y — the threshold limit and the rate at which Chef is currently working at.

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
	        int X = sc.nextInt(), Y = sc.nextInt();
	        
	   
	        if(X>=Y){
	            System.out.println("NO");
	        }
	        else{
	            System.out.println("YES");
	        }
	        
	}
}
