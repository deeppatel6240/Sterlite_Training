/*
 * Author: deepkumar.sherathiya@stltech.in
 * Creation Date: 8-June-2021
 * Version: 1
 * Copyright: Sterlite Technologies Ltd.
 */


//This is my package which contain day1 programs
package Day1;
import java.util.Scanner;

//This is client code used to check whether string is palindrome or not.
public class Palindrome {
	public static boolean checkPalindrome(String s) {
		boolean b = false;
		
		int i = 0;
		int j = s.length() - 1;
		while(i < (s.length()- 1)){
			
			if (s.charAt(i) != s.charAt(j)) {
				return b;
			}
			
			i++;
			j--;
			
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String : ");
		
		//this is my user input		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		//print function which is used to print output	
		System.out.println("That is : " + checkPalindrome(str));
	}

}
