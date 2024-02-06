// Chef and Chefina are playing with dice. In one turn, both of them roll their dice at once.They consider a turn to be good if the sum of the numbers on their dice is greater than 
// 6. Given that in a particular turn Chef and Chefina got X and Y on their respective dice, find whether the turn was good.

import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
    		int x = sc.nextInt();
    		int y = sc.nextInt();
        if(x+y>6){
        System.out.println("YES");
		}
		else System.out.println("NO");
		
	}
}
}
