// Each item in Chef’s menu is assigned a spice level from 1 to 
// 10. Based on the spice level, the item is categorised as:
// MILD: If the spice level is less than 4.
// MEDIUM: If the spice level is greater than equal to 4 but less than 7
// HOT: If the spice level is greater than equal to 7.Given that the spice level of an item is X, find the category it lies in.

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    
	    Scanner in = new Scanner(System.in);
	    int t = in.nextInt();
	    System.out.println("");
	    while(t-->0)
	    {
	        int x = in.nextInt();
	        if(x<4)
	        System.out.println("MILD");
	        else if (x>=4 && x<7)
	        {
	            System.out.println("MEDIUM");
	        }
	        else System.out.println("HOT");
	        
	    }
	    
	}
}