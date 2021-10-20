package basicprograms;

import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the number ");
		
		int x = obj.nextInt();
		primeNumber(x);
		
	}

	static void primeNumber(int num) {
		
		for(int i = 2 ; i <= num ; i++) {
			
			if(i % 2 == 1 ) {
				System.out.println("Number is prime:" + i);
			}
		}
	}
}
