package numbersprograms;

import java.util.Scanner;

public class LCMTwoNumbers {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter first number:");

		int num1 = obj.nextInt();

		System.out.println("Enter second number:");

		int num2 = obj.nextInt();
		
		int lcm = lcmOfNumber(num1 , num2);
		
		System.out.println("LCM of two number is:" + lcm);

	}
	
	static int lcmOfNumber(int x , int y) {
		
		int max ,min = 0 , z, lcm = 0;
		if(x > y) {
			max = x;
			min = y;
		}else {
			max = y;
			min = x ;
		}
		
		for(int i = 1 ; i <= min ; i++) {
			
			z = max * i;
			
			if(z % min == 0 ) {
				
				lcm = z;
				break;
			}
		}
		return lcm ;
	
	}
}
