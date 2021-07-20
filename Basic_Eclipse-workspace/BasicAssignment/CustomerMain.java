

class Customer{
	private int customerId;
	private String name;
	private int age;
	private String city;
	private int pinCode;
	
	
	public Customer(){
		super();
	}
	
	public Customer(int i, String n, int a, String c, int p) {
		customerId = i;
		name = n;
		age = a;
		city = c;
		pinCode = p;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void printDetails() {
		System.out.println("this is all details of mine");
		System.out.println("my customer id is : " + customerId);
		System.out.println("my name is : " + name);
		System.out.println("my age is : " + age);
		System.out.println("my city is : " + city);
		System.out.println("city's pincode is : " + pinCode);
	}
	
}

public class CustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// object of customer
		Customer obj = new Customer();
		
		// set name
		obj.setName("Deep");
		
		// get value
		System.out.println("my name is :" + obj.getName());
		
		
		//second object of customer
		Customer obj1 = new Customer(12, "Deep", 22, "Rajkot", 360410);
		obj1.printDetails();
		
	}

}
