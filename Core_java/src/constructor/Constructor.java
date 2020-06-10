package constructor;

public class Constructor {

	public static void main(String[] args) {
		
		Constructor obj = new Constructor();
		Constructor obj1 = new Constructor(10);
		Constructor obj2 = new Constructor(20,30);
		Constructor obj3 = new Constructor(40, "Rajive");
		
//		obj.Constructor();
//		obj.Constructor(10);
//		obj.Constructor(20, 30);
//		obj.Constructor(40, "Rajive");
		
		
	

	}
	
	public Constructor() {
		System.out.println("This is Default Constructor");
		
	}
	public Constructor(int i) {
		System.out.println("This is Single paramiter Constructor, value of i "+i);
		
	}
	public Constructor(int j, int k) {
		
		System.out.println("This is double paramiter Constructor, value of j and K "+j +" "+ k);
		
	}
	public Constructor(int l, String s) {
		
		System.out.println("This is triple paramiter Constructor, value of l and s "+l +" "+ s);
	}

}
