
import java.util.Scanner;

public class Fibonacci {

	public static void fibo(int terms) {
		int first_term = 0;
		int second_term = 1;

		System.out.println("Fibonacci series: ");
		
		for(int i = 1; i <= terms; ++i) {
			System.out.println(first_term+ ", ");
			
			int next_term = first_term + second_term;
			first_term = second_term;
			second_term = next_term;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the no of terms :");
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		fibo(t);
			
		
	}

}
