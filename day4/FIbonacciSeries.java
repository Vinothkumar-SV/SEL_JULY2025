package week1.day4;

public class FIbonacciSeries {
	// fibonacci series is the series of number which adding the two number before
	// in it
	// sereies =5
//	0    1     1  2 3 5 8 13 21 

//	1st 2nd

//3rd=1st+2nd 1 +1 = 2   3rd=2
	// 1st=2nd
	// 2nd=3rd

	// need firstnuber ande second number

	// need iteration
	// add two number and store in separate variable third =first+second
	// n3 0 +1 = n3=1
	// n3 2+3 n3=3
	// second =third
	// n2=2
	// first= second
	// n1=1

	public static void main(String[] args) {

		//
		int series = 5, n1 = 0, n2 = 1, n3;
		//
		System.out.println(n1 + "," + n2);

		//
		for (int i = 2; i <= series; i++) {
			//
			n3 = n1 + n2;
			//
			System.out.println(n3);
			n1 = n2;
			n2 = n3;

		}

	}

}
