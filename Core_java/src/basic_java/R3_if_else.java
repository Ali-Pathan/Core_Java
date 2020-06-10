package basic_java;

public class R3_if_else {

	public static void main(String[] args) {
		
		int a = 100;
		int b = 200;
		
		
		if(b>a) {
			System.out.println("b is greater than a");
		}
		else {
			System.out.println("a is greater than b");

		}
		
		int c = 50;
		int d = 50;
		
		if(c==d) {
			System.out.println("c and d are equal");
		}
		else {
			System.out.println("c and d are not equal");

		}
		
		int e = 50;
		int f = 70;
		
		if(e!=f) {
			System.out.println("e and f are not equal");
		}
		else {
			System.out.println("c and d are equal");

		}
		
		int a1 = 10;
		int b1 = 40;
		int c1 = 30;
		
		// Nested use of if else
		
		if(a1>b1 & a1>c1) {
			System.out.println("A is greater than B and C");
		}
		else if (b1>a1 & b1>c1) {
			System.out.println("B is greater than A and C");

		}
		else {
			System.out.println("C is greater than A and B");
		}

	}

}
