package constructor;

public class Constructor_With_Super_KeyWord_Child extends Constructor_With_Super_KeyWord_Parent {

	public static void main(String arg[]) {

		Constructor_With_Super_KeyWord_Child obj = new Constructor_With_Super_KeyWord_Child();

		Constructor_With_Super_KeyWord_Child obj1 = new Constructor_With_Super_KeyWord_Child(10);

		Constructor_With_Super_KeyWord_Child obj2 = new Constructor_With_Super_KeyWord_Child(20, 30);

	}

	public Constructor_With_Super_KeyWord_Child() {
		super();
	}

	public Constructor_With_Super_KeyWord_Child(int i) {
		super(i);

	}

	public Constructor_With_Super_KeyWord_Child(int j, int k) {
		super(j, k);

	}

}
