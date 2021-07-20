package com.phoenix.inner;

public class OuterML {

	public void show() {

		// method variables
		int a = 10; // implicity final and in we have to declare final if we used compiler version
					// 1.7 or before
		// a = 20; ----> can't change value of a

		// inner class
		class Inner {

			private int x;

			// int a; // compiler made this copy of local variable if you method variable is
			// final

			public Inner() {
				// TODO Auto-generated constructor stub
				x = 25365;
			}

			public Inner(int x) {
				super();
				this.x = x;
			}

			public void test() {
				System.out.println("x is : " + x);
				// a = 124; ---> you can't change value of method var here
				System.out.println("Method var: " + a /* a is of inner class */ );
			}
		} // end inner class

		Inner in1 = new Inner(123);
		Inner in = new Inner();
		in.test();
		in1.test();
	} // end of method
} // end of outer class
