package object_Oriented_Programming_Concept_1;

public class R7_CallByValueAndReference {
	
	int p;
	int q;

	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		
		R7_CallByValueAndReference obj = new R7_CallByValueAndReference();
		int z= obj.CallbyValue(x, y);// Method call by value/pass by value
		System.out.println(z);
		System.out.println();
		
		
		
		obj.p = 50;// Method call by value/pass by Reference and Swamping
		obj.q = 100;
		
		System.out.println("Before Swap");
		
		System.out.println("P value is "+ obj.p);
		System.out.println("Q value is "+obj.q);
		System.out.println();
		
		obj.CallbyReference(obj);
		
		System.out.println("After Swap");
		
		System.out.println("P value is "+ obj.p);
		System.out.println("Q value is "+obj.q);
		
	}
	
	public int CallbyValue(int a, int b) {
		int c = a+b;
		return c;
		
	}
	
	public void CallbyReference(R7_CallByValueAndReference t) {
		int temp;
		temp = t.p;
		t.p = t.q;
		t.q = temp;
	
		
		
		
	}
	
	

}
