package numbersprograms;

import java.util.Scanner;
import java.lang.Math;

public class SunnyNumber {

	public static void main(String[] args) {
		
	
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int number = obj.nextInt();
		System.out.println("Your entered number is " + number);
		
		double  number1  = number + 1;
		
		double squire = Math.sqrt(number1);
		
		System.out.println(squire );
		
		if(number1 / squire == squire ) {
			System.out.println("This is sunny number " + number1);
		}else {
			System.out.println("This is not sunny number " + number1);
		}
			

	}

}
