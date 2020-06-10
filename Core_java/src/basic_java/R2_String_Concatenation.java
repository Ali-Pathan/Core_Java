package basic_java;

public class R2_String_Concatenation {

	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		
		String c = "Hello";
		String d = "World";
		
		System.out.println(a+b);
		System.out.println(c+d);
		System.out.println(a+b+c+d);
		System.out.println(c+d+a+b);
		System.out.println(c+d+(a+b));
	}

}
