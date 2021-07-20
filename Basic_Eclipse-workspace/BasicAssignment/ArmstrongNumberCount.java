
import java.util.*;

public class ArmstrongNumberCount {
	
	public static void armstrongCount(int count) {
		
		int copy = 0;
		int rem, sum, x;
		
		while(count != 0) {
			copy++;
			x = copy;
			sum = 0;
			
			while (copy != 0) {
				rem = copy % 10;
				sum = sum + (rem * rem * rem);
				copy = copy / 10;
			}
			
			if (sum == x) {
				System.out.println(x + " ");
				count--;
			}
			copy = x;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enterthe no of count : ");
		
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		
		armstrongCount(c);
	}

}
