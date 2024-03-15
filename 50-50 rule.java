
// Schools of Chefland use the 50−50 rule to grade their students. As per the rule , students are awarded :Z grade, if their attendance is strictly less than 
// 50%- 50% .
// F grade, if they score strictly less than 50% marks, given that their attendance is greater than or equal to 50% .
// A grade, otherwise.
// You are given two integers,X and Y, denoting the percentage of attendance and percentage of marks obtained by Alice. What grade will Alice get?

// Input Format
// The first line of input will contain a single integer T, denoting the number of test cases.
// Each test case consists of two space-separated integers X and Y — the percentage of attendance and percentage of marks obtained by Alice.

// Output Format
// For each test case, output on a new line, the grade awarded to Alice.
// Note that you may print the grade in lowercase or uppercase.

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner s=new Scanner(System.in);
	    int a=s.nextInt();
	    while(a-->0){
	        int x=s.nextInt();
	        int y=s.nextInt();
	        if(x<50){
	            System.out.println("Z");
	        }
	        else if(y<50&&x>=50){
	            System.out.println("F");
	        }
	        else{
	            System.out.println("A");
	        }
	    }
	
	}
}
