package week1.day4;

public class Formulate {

	
	// ZAAKRAPRPSS to ZAKAPPS without inbuild methods
	// input = ZAAKRAPRPSS
	// output = ZAKAPPS
		
	public static void main(String[] args) {
		String input = "ZAAKRAPRPSS";
		String output = "";
		for (int i = 0; i < input.length(); i++) {
			char currentChar = input.charAt(i);
			if (output.indexOf(currentChar) == -1) { // Check if character is not already in output
				output += currentChar; // Append unique character to output
			}
		}
		System.out.println(output); // Print the final output
	}
}
