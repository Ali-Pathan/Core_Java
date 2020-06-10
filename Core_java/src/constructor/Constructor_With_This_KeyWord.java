package constructor;

public class Constructor_With_This_KeyWord {
	
	String	name;
	int		age;

	public static void main(String[] args) {
		Constructor_With_This_KeyWord obj = new Constructor_With_This_KeyWord("Rajive", 40);

	}
	
	public Constructor_With_This_KeyWord(String name, int age) {
		this.name	=	name;
		this.age	=	age;
		System.out.println(name +" "+age);
		
	}

}
