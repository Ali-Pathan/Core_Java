package object_Oriented_Programming_Concept_1;

public class R1_Car {
	// Class variable
	String mak;
	int yer;

	public static void main(String[] args) {
		// in this line new Car is a Object and c is a object reference variable.
		R1_Car a = new R1_Car();
		R1_Car b = new R1_Car();
		R1_Car c = new R1_Car();

		a.mak = "BMW";
		a.yer = 2019;
		
		b.mak = "Honda";
		b.yer = 2017;
		
		c.mak = "Nissan";
		c.yer = 2004;
		
		System.out.println("before ref*****");
		
		System.out.print(a.mak+" ");
		System.out.println(a.yer);
		
		System.out.print(b.mak+" ");
		System.out.println(b.yer);
		
		System.out.print(c.mak+" ");
		System.out.println(c.yer);
		
		System.out.println("After ref*****");
		
		a=b;
		b=c;
		c=a;
		
		a.yer=2019;
		System.out.println(a.yer);
		
		c.yer=2004;
		System.out.println(a.yer);
	}

}
