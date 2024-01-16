// Alice wrote an exam containing N true or false questions (i.e. questions whose answer is either true or false). Each question is worth 
// 1 mark and there is no negative marking in the examination. Alice scored 
// K marks out of N.
// Bob wrote the same exam but he marked each and every question as the opposite of what Alice did, i.e, for whichever questions Alice marked true, Bob marked false and for whichever questions Alice marked false, Bob marked true.
// Determine the score of Bob.

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner input = new Scanner(System.in);
	    int test = input.nextInt();
	    while(test>0){
	        int n,k;
	        n = input.nextInt();
	        k=input.nextInt();
	        System.out.println(n-k);
	        test--;
	    }

	}
}
