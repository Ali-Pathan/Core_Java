package object_Oriented_Programming_Concept_1;

public class R5_StaticAndNonStatic {

	String name = "rajive"; // Non static global variable
	static int age = 23; // Static global variable

	public static void main(String[] args) {

		// To call Non Static Method need to be create a class object

		R5_StaticAndNonStatic obj = new R5_StaticAndNonStatic();
		obj.NonStaticMethod();

		// To call Static Method there is 2 way
		// 1. direct call the method (StaticMethod();)
		
		StaticMethod();
		
		// 2. By Class (R5_StaticAndNonStatic.StaticMethod();)
		
		R5_StaticAndNonStatic.StaticMethod();
		
		
		// To call static global variable there is 2 way
		// 1. direct call the method (StaticMethod();)
			System.out.println(age);
			
		// 2. By Class
			System.out.println(R5_StaticAndNonStatic.age);
			
	}

	public void NonStaticMethod() {
		System.out.println("Non Satic Method");

	}

	public static void StaticMethod() {
		System.out.println("Satic Method");

	}
	
	

}
