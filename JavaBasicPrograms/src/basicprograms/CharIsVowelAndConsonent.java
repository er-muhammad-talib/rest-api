package basicprograms;
import java.util.Scanner;

public class CharIsVowelAndConsonent {

	
	void checkNumber(char y) {
		
			
		 if (y == 'a' || y == 'e' || y == 'i' || y == 'o'
		            || y == 'u' || y == 'A' || y == 'E' || y == 'I'
		            || y == 'O' || y == 'U')
		            System.out.println("It is a Vowel.");
		        else
		            System.out.println("It is a Consonant.");
		
	}
	public static void main(String[] args) {
		

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter character");
		
		char ch = obj.next().charAt(0);
		
		CharIsVowelAndConsonent cha = new CharIsVowelAndConsonent();
		
		cha.checkNumber(ch);
	}

}
