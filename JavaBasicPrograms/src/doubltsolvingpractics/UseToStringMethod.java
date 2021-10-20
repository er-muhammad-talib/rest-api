package doubltsolvingpractics;

public class UseToStringMethod {

	
	
	public  int id ;
	public String name ;
	public String account;

	public UseToStringMethod(int id1, String name1, String account1) {
		
		id = id1;
		name = name1;
		account = account1;
	}
	
	public String toString() {
		return  "Your id " + id  + "\nYour name " + name + "\nYour account no " + account;
	
	}
	

}
