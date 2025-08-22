package week3.day4;

public class Variables {
// it act like a container to store the data	
	int a = 10; // non static global variable
	static String name = "TestLeaf"; // static global variable
	final int b = 30; // final global variable

	public void printData() {
		int b = 20; // local variable
		System.out.println(a);
		System.out.println(b);

	}

	public void changeData() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(Variables.name);
	}

	public static void main(String[] args) {
		Variables obj = new Variables();
		obj.printData();
		System.out.println(name);
	}

}
