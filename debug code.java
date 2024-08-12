// You are given the age of a person as the variable age. Will this person be able to vote?
// Output 1 or 0 assuming that the voting age is 18 i.e., a person's age has to be greater than or equal to 18 to vote.

// Solution
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int age = 18;
	    if(age >= 18){ // adding '=' operator.
	        System.out.println(1);
	    }
	    else{
	        System.out.println(0);
	    }
	}
}
