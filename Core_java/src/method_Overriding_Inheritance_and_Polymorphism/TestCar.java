package method_Overriding_Inheritance_and_Polymorphism;

public class TestCar {

	public static void main(String[] args) {
		
// static Polymorphism
		BMW bmw = new BMW();
		bmw.Start();
		bmw.Stop();
		bmw.saftey();
		bmw.fuel();
		bmw.Engine();
		
		System.out.println("********");
		
		Car c = new Car();
		c.Start();
		c.Stop();
		c.fuel();
		
		System.out.println("********");
		
		Car c1 = new BMW(); // this is dynamic Polymorphism, child class object can be referred by parent class reference variable
		c1.Start();
	}

}
