package week4.day2;

public class PalindromeWithNumber {

	public static void main(String[] args) {

		int num = 12331;
		int var = num;

		int rem = 0;

		int temp = 0;
	

		while (num > 0) {

			rem = num % 10; // 5 4

			temp = temp * 10 + rem; // 5 54 543 5432 54321

			num = num / 10;

		}

		if (var == temp) {
			System.out.println("The number is palindrome");
		} else {
			System.out.println("The number is not a palindrome");

		}

	}
}
