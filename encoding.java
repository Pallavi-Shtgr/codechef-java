// Chef recently graduated Computer Science in university, so he was looking for a job. He applied for several job offers, but he eventually settled for a software engineering job at ShareChat. Chef was very enthusiastic about his new job and the first mission assigned to him was to implement a message encoding feature to ensure the chat is private and secure.
// Chef has a message, which is a string S with length N containing only lowercase English letters. It should be encoded in two steps as follows:
// Swap the first and second character of the string S, then swap the 3rd and 4th character, then the 5th and 6th character and so on. If the length of S is odd, the last character should not be swapped with any other.
// Replace each occurrence of the letter 'a' in the message obtained after the first step by the letter 'z', each occurrence of 'b' by 'y', each occurrence of 'c' by 'x', etc, and each occurrence of 'z' in the message obtained after the first step by 'a'.

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++){
		    int n = sc.nextInt();
		    String s = sc.next();
		    char[] arr = s.toCharArray();
		    for(int j=0;j<n-1;j+=2){
	
		        char temp = arr[j+1];
		        arr[j+1] = arr[j];
		        arr[j] = temp;
		    }
		   
		    for (int j = 0; j < n; j++) {
            arr[j] = (char)(25 - (int)(arr[j]) + 2*97);
            }
            
		    String str = new String(arr);
		    System.out.println(str);
		}
	}
}