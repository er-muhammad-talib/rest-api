package doubltsolvingpractics;

import java.util.Scanner;

public class ToStringMethod {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		System.out.println("Enter Id");
		int id = obj.nextInt();

		System.out.println("Enter name");
		String name = obj.nextLine();

		System.out.println("Enter account no");
		String account = obj.nextLine();

		UseToStringMethod ts = new UseToStringMethod(id, name, account);

		System.out.println(ts.toString());

	}

}
