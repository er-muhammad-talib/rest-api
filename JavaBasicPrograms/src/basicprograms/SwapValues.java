package basicprograms;

import java.util.Scanner;
public class SwapValues {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter first Number:");
		
		int num =  obj.nextInt();
		
		
		System.out.println("Enter second Number:");
		int num2 = obj.nextInt();
		
		
		swapValuse(num , num2);
	}
	
	public static void swapValuse(int num , int num2) {
		
		int temp = num ;
		
		num =  num2 ;
		
		num2 = temp;
		
		System.out.println("First number after swaping:" + num );
		
		System.out.println("second number after swaping:" + num2);
		
		
	}
}
