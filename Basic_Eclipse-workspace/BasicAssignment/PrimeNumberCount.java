
import java.util.*;

public class PrimeNumberCount {

	public static void primeCount(int count) {
		int i, p, c, flag;
		
		p = 2;
		i = 1;
		
		while (i <= count) {
			flag = 1;
			
			for (c = 2; c <= p-1; c++) {
				if (p % c == 0) {
					flag = 0;
					break;
				}
			}
			if (flag == 1) {
				System.out.println(p + " ");
				i++;
			}
			p++;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of count : ");
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		
		primeCount(c);
	}

}
