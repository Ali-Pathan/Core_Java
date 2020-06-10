package object_Oriented_Programming_Concept_1;

public class R3_localVsGlobal {
	
	String name = "Rajive"; // global variable 
	int age=35;				// global variable 
							// to use global variable need to create a class object.

	public static void main(String[] args) {
		int i = 25;// local 
		System.out.println(i);
		
		R3_localVsGlobal obj = new R3_localVsGlobal();
		System.out.println(obj.name);
		System.out.println(obj.age);
		
		int f= obj.sum2();
		System.out.println(f);
		
		

	}
	
	public void sum() {// local variable only in sum method i cannot use those.
		int i = 10;
		int j= 20;

	}
	public int sum2() {// local variable only in sum2 method i can use when there is no void.
		int k = 30;
		int l= 50;
		int m = k+l;
		return m;

	}

}
