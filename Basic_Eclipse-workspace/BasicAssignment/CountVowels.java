/*
 * Author: deepkumar.sherathiya@stltech.in
 * Creation Date: 8-June-2021
 * Version: 1
 * Copyright: Sterlite Technologies Ltd.
 */

//This is my package which contain all programs

import java.util.*;

//This is client code used to count number of vowels in string
public class CountVowels {

	//This is public member of CountVowels class		
	public static int countVowels(String str) {
		int vowelscount = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' ||
				str.charAt(i) == 'e' ||
				str.charAt(i) == 'i' ||
				str.charAt(i) == 'o' ||
				str.charAt(i) == 'u') {
					vowelscount++;
			}
		}
		
		return vowelscount;
	}
	//Thsi is my main method	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String : ");
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		//This is print inbuilt function which will give us no of vowels in string 		
		System.out.println("There are " + countVowels(s)+ " vowels in String");
	}
}
//End of the class

