package com.phoenix.interfaces.functional;

/*
 * Creator Name: deepkumar.sherathiya@stltech.in
 * Date: 14/07/2021
 * Version: 1.0
 * Copyright: Sterlite Tech Ltd.
 */
public class LambdaExpressionDemo {
		
	public void doMath(Addable ob) {
		System.out.println(ob.add(120, 130));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// lambda function for Movable interface
		Movable m = () -> System.out.println("Anonymous object moves");
		m.move();

		// lambda function for Jumpable interface
		Jumpable j = () -> {
			System.out.println("Anonymous object jump");
		};
		j.jump();

		// lambda function for Addable interface
		Addable a = (int x, int y) -> {
			return x + y;
		};
		int res = a.add(10, 20);
		System.out.println("Addition is: " + res);

		// lambda function for Addable interface
		Addable a1 = (x, y) -> x + y;
		int res2 = a1.add(100, 200);
		System.out.println("Addition is: " + res2);

		// lambda function for Addable interface
		Addable a2 = (x, y) -> {
			return x + y;
		};
		int res3 = a2.add(1000, 20);
		System.out.println("Addition is: " + res3);

		// lambda function Greeting interface
		Greeting g = x -> {
			return x + 10;
		};
		int gt = g.greet(30);
		System.out.println("Addition is: " + gt);
		
		// object of class
		LambdaExpressionDemo ob = new LambdaExpressionDemo();
		// functional programming
		ob.doMath((c, d) -> c + d);
		
		// anonymous class
		//ob.doMath(new Addable() {
			
		//	@Override
		//	public int add(int x, int y) {
				// TODO Auto-generated method stub
		//		return x + y;
		//	}
		//});
		
		
		// calling default method
		float res4 = a1.addFloats(3.5f, 5.5f);
		System.out.println("Addition of floats: " + res4);
		
		// invoking static method of interface
		Addable.show();
	}

} // end of the class
