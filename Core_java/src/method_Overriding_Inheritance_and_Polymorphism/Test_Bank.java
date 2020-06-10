package method_Overriding_Inheritance_and_Polymorphism;

public class Test_Bank {

	public static void main(String[] args) {
		
		System.out.println(USBank.Min_Balance);	
		
		
		Bangladesh_Bank bdbank = new Bangladesh_Bank();
		
		bdbank.Credit();
		bdbank.Dabit();
		bdbank.ATM();
		bdbank.Student_lon();
		bdbank.House_lon();
		
		System.out.println("********");
		
		USBank c1 = new Bangladesh_Bank(); // this is dynamic Polymorphism, child class object can be referred by parent class reference variable
		c1.ATM();

	}

}
