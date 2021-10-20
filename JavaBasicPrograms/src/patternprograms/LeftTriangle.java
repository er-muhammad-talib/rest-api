package patternprograms;

import java.util.Scanner;
public class LeftTriangle {
	
	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("How many row  in triangle do you went: ");
		int num = obj.nextInt();
		
		leftTraingle(num);
		
	}
	
	static void leftTraingle(int number) {
		
		for(int i = 1 ; i <= number ; i++) {
			
			for(int j = i ; j <= number  ; j++) {
				System.out.print(" ");
			}
			
			for(int k =  number ; k < number + i ; k++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		
	}

}
