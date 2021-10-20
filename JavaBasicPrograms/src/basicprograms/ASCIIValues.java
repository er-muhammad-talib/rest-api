package basicprograms;
import java.util.Scanner;
public class ASCIIValues {

	public static void main(String[] args) {
	
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the value");
		char ch = obj.next().charAt(0);
		
		int asciiValue = ch;
		
		System.out.println("ASCII Value of " + ch + " is " + asciiValue);
		

	}

}
