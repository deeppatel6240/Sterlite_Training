
import java.util.*;

public class CharCount {
	public static int countChar(String str, char ch) {
		int counter = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				counter++;
			}
		}
		return counter;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "helloll";
		char ch = 'l';
		
		System.out.println("Charater " + ch + " occurs " + countChar(str, ch) + " times");
	}

}
