package week1.day4;

public class StringRevers {

	// input=vinoth
	// output=htoniv

	public static void main(String[] args) {
		String input = "vinoth";
		// 012345

		for (int i = input.length() - 1; i >= 0; i--) {

			System.out.print(input.charAt(i));

		}
	}

}
