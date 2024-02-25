// In ChefLand, human brain speed is measured in bits per second (bps). Chef has a threshold limit of 
// X bits per second above which his calculations are prone to errors. If Chef is currently working at  Y bits per second, is he prone to errors?
// If Chef is prone to errors print YES, otherwise print NO.

import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
	    if(x<y)
	    System.out.println("YES");
		else System.out.println("NO");
	    
	}
}
