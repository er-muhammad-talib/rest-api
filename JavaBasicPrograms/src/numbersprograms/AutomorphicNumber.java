package numbersprograms;

import java.util.Scanner;
import java.lang.Math;
public class AutomorphicNumber {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter number");

		int number = obj.nextInt();
		
		int power = number * number;
		int temp2 = power;
		
		int temp = number;
		int count =0;
		while(temp > 0 ) {
			count++ ;
			
			temp = temp / 10; 
		}
		
int num1 , num2 , num3  = 0, num4 =0;
		while( count > 0) {
			count-- ;
			
			num1 = temp2 % 10;
			
			num2= number % 10;
			
			num3 = (num3 * 10 ) + num1;
			num4 = (num4 * 10) + num2 ;
			
			temp2 = temp2 / 10;
			
			number  = number / 10;
			
			
		}
		if(num3 == num4) {
			System.out.println("Number is automorphic " + power);
		}else {
			System.out.println("Number is not automorphic " + power );
		}
		


	}
	
	

}
