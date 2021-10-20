package numbersprograms;

import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int number = obj.nextInt();
		
		int temp = number;
		
		int num1 , digit = 0  , num2;
		int count = 0;
		while(temp > 0) {
			temp = temp / 10;
			count++;
		}
		int sum= 0;
		int temp2 = number;
		while(temp2 > 0 ) {
			
			num1 = temp2 % 10;
			digit = digit * 10 + num1;
			
			temp2 = temp2 / 10;
			
				int pow= (int)Math.pow(digit ,count);
				
				sum = sum + pow;
				
				digit = 0 ;
		}
		
		if(sum == number) {
		System.out.println( "this is  armstrong number " + sum);
		}else {
			System.out.println("this is not armstrong Number " + sum);
		}
	}

}
