package basicprograms;

import java.util.Scanner;
public class UserInput {
	
	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		
	
//		int num = obj.nextInt();
		
//		String sen = obj.nextLine();
		
		char character = obj.next().charAt(0);
		
		System.out.println("you enter number:  " + character);
	}

}
