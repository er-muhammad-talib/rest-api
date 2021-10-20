package basicprograms;
import java.util.Scanner;
public class Primeumber {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int number = obj.nextInt();
		
		if(number % 2 ==0) {
			System.out.println("Number is not prime");
		}else {
			System.out.println("Number is prime");
		}
		
	}
}
