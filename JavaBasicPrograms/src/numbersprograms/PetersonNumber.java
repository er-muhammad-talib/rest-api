package numbersprograms;

import java.util.Scanner;

public class PetersonNumber {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number");

		int number = obj.nextInt();

		int petersonNumber = 0;

		int temp = number;
		int fectorial = 1;
		while (temp > 0) {

			int digit = temp % 10;

			while (digit > 0) {
				fectorial = fectorial * digit;

				digit--;
			}

			petersonNumber = petersonNumber + fectorial;

			fectorial = 1;
			temp = temp / 10;
		}

		if (petersonNumber == number) {
			System.out.println("Number is peterson " + petersonNumber);
		} else {
			System.out.println("Number is not peterson " + petersonNumber);
		}
		System.out.println("your number is " + number);

	}

}
