package object_Oriented_Programming_Concept_1;

public class R2_FunctionsInJava {

	public static void main(String[] args) {
		
		//to access method, one class object must need to be created
		
		R2_FunctionsInJava obj = new R2_FunctionsInJava();
		obj.test1();
		
		int i=obj.test2();
		System.out.println(i);
		
		String s1=obj.test3();
		System.out.println(s1);
		
		
		int div=obj.test4(20, 5);
		System.out.println(div);
		

	}
	
	//Non static method no input
	
	public void test1() {
		System.out.println("Test1 is a non static Method");
	}
	
	
	// if want to return something don't put void and instead of void put the data type.
	
	public int test2() {
		System.out.println("Test2 Method");
		
		int a = 5;
		int b = 20;
		int c = a+b;
		
		return c;
	}
	public String test3() {
		
		System.out.println("Test3 Method");
		
		String s = "Selenium";
		
		return s;
	}
	
	//Non static method with input
	// x and y is a input parameters.
	
	public int test4(int x, int y ) {
		System.out.println("Test4 is a Non static method with input");
		int d=x/y;
		return d;
		
	}

}
