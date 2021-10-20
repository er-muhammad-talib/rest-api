package basicprograms;

import java.util.Scanner;
public class SwapValues2 {
	
	
	
	static void swapTwoNumber(int num1 , int num2) {
		
		
		num1 = num1 - num2 ;
		
		 num2 = num1 + num2 ;
		 
		 num1 = num2 - num1;
		 
		 System.out.println("First swap number:" + num1 );
		 System.out.println("Second swap number:" + num2 );
		
		
	}

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter first number:");
		int num1 = obj.nextInt();
		
		System.out.println("Enter second number:");
		int num2 = obj.nextInt();
		
		swapTwoNumber(num1 , num2);

		
	}

}
