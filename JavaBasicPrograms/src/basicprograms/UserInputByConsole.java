package basicprograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class UserInputByConsole {

	public static void main(String[] args) throws IOException{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter input");
		
		String name = reader.readLine();
		
		System.out.println("you enter name: " + name);

	}

}
