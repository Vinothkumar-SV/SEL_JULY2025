package week2.day3;

public class PerfectSquare {
	// This program checks if a number is a perfect square by iterating through possible square roots.
	// It uses a simple loop to check if the square of any integer equals the given number.
	// If it finds such an integer, it concludes that the number is a perfect square.
	

	public static void main(String[] args) {
		int n = 16; // Example number
		boolean isPerfectSquare = false;

		for (int i = 1; i * i <= n; i++) {
			if (i * i == n) {
				isPerfectSquare = true;
				break;
			}
		}

		if (isPerfectSquare) {
			System.out.println(n + " is a perfect square.");
		} else {
			System.out.println(n + " is not a perfect square.");
		}
	}

}
