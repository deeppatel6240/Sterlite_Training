
import java.util.Scanner;

public class Factorial {
	static int fact(int num) {
		int output = 1;
		if (num < 0) {
			System.out.println("please try again");
		}
		else if(num == 0) {
			return 1;
		}
		else {
			return (num * fact(num - 1));
		}
		return output;
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number :");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int f = fact(n);
		System.out.println("factorial number is : " + f);
		
	}

}
