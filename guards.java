// Ezio can manipulate at most 
// X number of guards with the apple of eden.
// Given that there are 
// Y number of guards, predict if he can safely manipulate all of them.

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner s=new Scanner(System.in); 
	    int n=s.nextInt(); 
	    while(n-->0){
	        int a=s.nextInt(); 
	        int b=s.nextInt(); 
	        if(a<b) 
	        System.out.println("NO"); 
	        else 
	        System.out.println("YES");
	    }

	}
}