package patternprograms;

import java.util.Scanner;

public class RightTriangal {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("How many row in triangle do you went:");
		int num = obj.nextInt();

// first Solution  

		for (int i = 0; i < num; i++) {

			for (int j = 0; j < i + 1; j++) {

				System.out.print( "* ");
			}

			System.out.println();

		}


		
		// second solution
/*
		int i = 0;
		while (i < num) {

			int j = 0;
			while (j < i + 1) {

				System.out.print("* ");
				j++;

			}

			System.out.println();
			i++;

		} */

	}

}
