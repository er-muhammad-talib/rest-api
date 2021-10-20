package basicprograms;

import java.util.Scanner;
public class FactorialNumber {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter number");
		
		int number = obj.nextInt();
		System.out.println("Factorial of this number " + number);
		
		int factorialNumber = 1;
		
		while(number > 0) {
			
			int lastDegit = number % 10 ;
			
			factorialNumber = factorialNumber  * lastDegit;
			
			number = number / 10;
			
			 
		}	
		
		System.out.println( "Factorial is " + factorialNumber);
		

	}

}
