package week1.day3;

public class FindFactorial {

	public static void main(String[] args) {

		int temp = 1;
		// initalize the value

		int number = 5;

		// iteration
		for (int i = number; i >= 1; i--) {

			// to strore the value using temp
			temp = temp * i;
			
			// temp=5*1
			// temp=5*4
			// temp=20*3
			// temp=60*2
			// temp=120*1
			// int a=5*4 =20
			// a=20*3=60
			// a=60*2 120
			// a=120*1=120

		}
		System.out.println("Factorial of Number "+number +" is :"+temp);

	}
}