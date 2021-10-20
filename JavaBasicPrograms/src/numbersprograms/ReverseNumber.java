package numbersprograms;
import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int number = obj.nextInt();
		
		int reverseNumber = 0 , lastDigit;
		
		while(number > 0) {
			lastDigit = number % 10 ;
			
			reverseNumber  = (reverseNumber * 10) + lastDigit;
			
			number = number / 10 ;
		}
		System.out.println("Reverse number is " + reverseNumber );
	}

}
