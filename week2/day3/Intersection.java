package week2.day3;

import java.util.Arrays;

public class Intersection {

	public static void main(String[] args) {
		// Array Literal
		int[] arr1 = { 10, 20, 30, 40, 50 };
		int[] arr2 = { 30, 40, 50, 60, 70 };
		
		Arrays.sort(arr1);
		//10, 20, 30, 40, 50
		Arrays.sort(arr2);
		//30, 40, 50, 60, 70
		
		for (int i = 0; i < arr1.length; i++) {
			//50
			
			for (int j = 0; j < arr2.length; j++) {
				//30, 40, 50, 60, 70
				
				if (arr1[i] == arr2[j]) {
					System.out.println("Intersection found: " + arr1[i]);
					//break; // Exit the inner loop once a match is found
				}
				
				
			}
			
		}
		
		
		
		
		
	}

}
