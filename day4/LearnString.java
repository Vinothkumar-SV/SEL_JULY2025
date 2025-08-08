package week1.day4;

public class LearnString {

	// String is a class in java
	// String is immutable
	// String is a sequence of characters

	// it will declare in two ways
	// 1st way
	// String Literal
	// sysntax
//	String variableName = "value";
	String name = "tesTLeaf";

	// 2nd way
	// using instance of String class

	String name1 = new String("Testleaf");

	public static void main(String[] args) {

		String name = "testleaf";

		// to find the length of the string
		int length = name.length();
		System.out.println(length);

		// to change the character at a specific index
		String upperCase = name.toUpperCase();
		System.out.println(upperCase);

		String lowerCase = name.toLowerCase();
		System.out.println(lowerCase);

	}

}


