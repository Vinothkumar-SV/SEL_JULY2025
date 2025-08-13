package week2.day3;

public class LearnArray {

	public static void main(String[] args) {

		// Array Literal
		int[] numbers = { 10, 20, 30, 40, 50 };

		String[] names = { "testleaf", "qeagle", "babu", "hari", "vinoth", "kumar" };
		int length2 = names.length;
		System.out.println("Length of the names array: " + length2);

		for (int i = names.length - 1; i >= 0; i--) {
			System.out.println("Element at index " + i + ": " + names[i]);
		}

		// Array Declaration

		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Element at index " + i + ": " + numbers[i]);
		}

		int length = numbers.length;
		System.out.println("Length of the array: " + length);

		// what is the DB .length; and length() in Java?
		// In Java, `length` is a property of arrays that returns the number of elements
		// in the array.
		// in java `length()` is a method of String objects that returns the number of
		// characters in the string.

		//Array instantiation
		int [] arr = new int[5]; // Creates an array of integers with a size of 5
		arr[0] = 10; // Assigning value to the first element
		arr[1] = 20; // Assigning value to the second element
		arr[2] = 30; // Assigning value to the third element
		arr[3] = 40; // Assigning value to the fourth element
		arr[4] = 50; // Assigning value to the fifth element
		arr[5] = 60; // This will throw an ArrayIndexOutOfBoundsException since the array size is 5
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Element at index " + i + ": " + arr[i]);
		}
		
	}

}
