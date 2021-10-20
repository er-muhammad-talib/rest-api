package basicprograms;

import java.util.Scanner;

public class AddTwoComplexNumber {

	Scanner obj = new Scanner(System.in);
	int real = obj.nextInt();

	int image = obj.nextInt();

	void complexNumber(int r, int m) {

		this.real = r;
		this.image = m;

		System.out.println(real + "+i" + image);

	}

	public static void main(String[] args) {

		AddTwoComplexNumber obj = new AddTwoComplexNumber();

		obj.complexNumber(obj.real, obj.image);

	}

}
