package numbersprograms;

import java.util.Scanner;

public class LargestThreeNumber {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		int a, b, c;

//		int largest ;

		System.out.println("Enter first number");
		a = obj.nextInt();

		System.out.println("Enter second number");
		b = obj.nextInt();

		System.out.println("Enter third number");
		c = obj.nextInt();

//		largest =largestNumber(a , b , c);

//		System.out.println(largest + " is a gratest number");

		largestNumber(a, b, c);
	}

	static void largestNumber(int x, int y, int z) {

		if (x == y && y == z) {

			System.out.println("All number is same  " + x + "  " + y + " " + z);

		} else if (x > y && y > z) {

//				return x ;
			System.out.println(x + " is a largest number");

		} else if (y > z && z > x) {

//				return y;
			System.out.println(y + " is a largest number");

		} else {

//				return z;
			System.out.println(z + " is a largest number");

		}

	}
}
