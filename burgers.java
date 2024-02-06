// Chef is fond of burgers and decided to make as many burgers as possible.Chef has A patties and B buns. To make 
// 1 burger, Chef needs 1 patty and 1  bun.
// Find the maximum number of burgers that Chef can make.



import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    
	Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();

		while (testCase-- > 0) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			System.out.println(makeBurger(x, y));
	}
	}
	
	public static int makeBurger(int x, int y) {
		if(x<y)
		return x;
		else
			return y;
		
	}

}
