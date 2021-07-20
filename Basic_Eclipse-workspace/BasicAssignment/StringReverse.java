
import java.util.*;

public class StringReverse {

	public static String reverse(String str) {
		char c[] = str.toCharArray();
		String reverse = "";
		
		for (int i = c.length - 1; i >= 0; i--) {
			reverse += c[i];
		}
		System.out.println(reverse);
		return reverse;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String :");
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		reverse(s);
	}

}
