package week4.day1;

public class ReplaceMethods {
	
	
	public static void main(String[] args) {
		
		
		String str = "I,am,happy";
		
		String replaceAll = str.replaceAll(",", " ");
		
		System.out.println(replaceAll);
		
		
		
		
		
		//\\s - it represents a whitespace character (spaces, tabs, line breaks)
		//\\S - it represents a non-whitespace character
		//\\d - it represents a digit (0-9)
		//\\D - it represents a non-digit character
		//\\w - it represents a word character (letters, digits, and underscores)
		//\\W - it represents a non-word character (anything other than letters, digits, and underscores)
		//\\b - it represents a word boundary (the position between a word character and a non-word character)
		//\\B - it represents a non-word boundary (the position between two word characters or two non-word characters)
		//^ - it represents the start of a string
		//$ - it represents the end of a string
		//. - it represents any character except a newline
		//* - it represents zero or more occurrences of the preceding character or group
		//+ - it represents one or more occurrences of the preceding character or group
		//? - it represents zero or one occurrence of the preceding character or group
		//{n} - it represents exactly n occurrences of the preceding character or group
		//{n,} - it represents n or more occurrences of the preceding character or group
		//{n,m} - it represents between n and m occurrences of the preceding character or group
		//| - it represents an OR operation between two characters or groups
		//() - it represents a group of characters or expressions
		//[] - it represents a character class, matching any one of the characters inside the brackets
		//[^] - it represents a negated character class, matching any one character not inside the brackets
		//\ - it is used to escape special characters, allowing them to be treated as literal characters
		//For example, to match a literal dot (.), you would use \. in your regex pattern.
		//\ - it is also used to introduce special sequences, such as \d for digits or \s for whitespace.
		//For example, \d matches any digit character (0-9).
		
	}

}
