package week1.day4;

public class StringRevers2 {

	// input=vinoth
	// output=htoniv

	public static void main(String[] args) {
		String input = "vinoth";

		// to split the string into characters

		char[] charArray = input.toCharArray();

		for (int i = charArray.length - 1; i >= 0; i--) {
			System.out.print(charArray[i]);

		}
	}

}
