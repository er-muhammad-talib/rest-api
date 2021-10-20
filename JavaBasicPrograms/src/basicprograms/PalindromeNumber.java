package basicprograms;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number");

		int number = obj.nextInt();

		int temp = number;

		int reverseNumber = 0, newNumber;

		while (number > 0) {

			newNumber = number % 10;

			reverseNumber = (reverseNumber * 10) + newNumber;

			number = number / 10;

		}

		if (temp == reverseNumber) {
			System.out.println("Number is palindrome");
		} else {

			System.out.println("Number is not palandrme");
		}

	}

}
