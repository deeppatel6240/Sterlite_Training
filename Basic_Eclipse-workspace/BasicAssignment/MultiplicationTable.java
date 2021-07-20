
import java.util.*;

public class MultiplicationTable {
		
		public static void mulTable(int n) {
			for (int i = 1; i < 11; i++) {
				System.out.println(n + "*" + i + "= " + (n*i));
			}
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Enter the number : ");
			
			Scanner sc1 = new Scanner(System.in);
			
			int num = sc1.nextInt();
			
			mulTable(num);
		}

}

