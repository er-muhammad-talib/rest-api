package numbersprograms;

import java.util.Scanner;

public class TechNumber {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number");

		int userNumber = obj.nextInt();

		int temp = userNumber;

		int firstHalf, count = 0, secondHalf;

		while (temp > 0) {

			count++;

			temp = temp / 10;

		}
		// when number is 99 digit this logic will be failed

		if (count % 2 == 0) {

			int num = userNumber;

			firstHalf = num % (int) Math.pow(10, count / 2);

			secondHalf = num / (int) Math.pow(10, count / 2);

			int sum = firstHalf + secondHalf;

			int newNumber = sum * sum;

			if (userNumber == newNumber) {
				System.out.println("This is tech number :" + newNumber);
			} else {
				System.out.println("This is not tech number :" + newNumber);
			}

		} else {
			System.out.println("This is not tech number " + userNumber);
		}
	}

}
