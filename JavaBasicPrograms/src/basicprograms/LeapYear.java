package basicprograms;
import java.util.Scanner;
public class LeapYear {

	static void leapYear(int leapYear) {
		for(int i = leapYear ; i > 0 ; i-- ) {
		if(i % 4 == 0) {
			System.out.println( i + " is leap year");
			
			break;
		}else {
			System.out.println(i + " is not leap year");
		}
		}
	}
	
	
	public static void main(String[] args) {
	
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter year:");
		
		int year = obj.nextInt();
		
		leapYear(year);

	}

}
