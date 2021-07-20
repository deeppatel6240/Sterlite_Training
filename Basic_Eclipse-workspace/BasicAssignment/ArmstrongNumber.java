
import java.util.Scanner;

public class ArmstrongNumber {
	public static void armstrong(int num) {
		int original_number, remainder, result = 0;
		original_number = num;
		
		while(original_number != 0) {
			remainder = original_number % 10;
			result += Math.pow(remainder, 3);
			original_number /= 10;
		}
		
		if(result == num) {
			System.out.println(num + " is a armstrong number");
		}
		else {
			System.out.println(num + " is not a armstrong number");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number: ");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		armstrong(n);
	}

}
