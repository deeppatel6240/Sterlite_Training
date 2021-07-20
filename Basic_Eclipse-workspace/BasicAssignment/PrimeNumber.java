
import java.util.Scanner;

public class PrimeNumber {

	public static String prime(int num) {
		String output = "prime";
		boolean flag = false;
		for (int i = 2; i <= num / 2; i++) {
			if(num % i == 0) {
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println(num + " is a prime number");
		}
		else {
			System.out.println(num + " is not a prime number");
		}
		
		return output;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		prime(n);
		
		
	}

}
