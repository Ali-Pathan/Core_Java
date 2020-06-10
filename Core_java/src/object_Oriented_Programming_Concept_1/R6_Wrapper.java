package object_Oriented_Programming_Concept_1;

public class R6_Wrapper {

	public static void main(String[] args) {
		
		String x = "100";
		int j = 200;
		int y = 20;
		
		//String to int
		System.out.println(x+y + " --> Because 100 is String");
		
		System.out.println("Now using Wrapper Class");
		
		int i = Integer.parseInt(x);
		System.out.println(i+y + " --> Because 100 is Wrapped by Integer class");
		System.out.println("**********");
		
		// int to String
		System.out.println("Now using Wrapper Class");
		System.out.println(j+y + " --> Because 200 is int");
		String s = String.valueOf(j);
		System.out.println(s+y + " --> Because 200 is Wrapped by String class");
		
		
		
		
		

	}

}
