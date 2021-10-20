package basicprograms;

import java.util.Scanner;

public class FebonacciSeries {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		
		System.out.println("What number of febonacci series do you went");

		int num = obj.nextInt();
		int febonacciNumber = 0;

		int firstNumber = 0, secondNumber = 1;

		System.out.println(firstNumber + "\n" + secondNumber);

		for (int i = 2; i < num; i++) {

			febonacciNumber = firstNumber + secondNumber;

			firstNumber = secondNumber;
			
			secondNumber = febonacciNumber;

			System.out.println(febonacciNumber);

		}

	}

}
