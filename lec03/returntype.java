package lec03;

public class returntype{
	public static void main(String args[]){
		String msg = greeting();
		System.out.println(msg + "This is printed using return type function - string");
	}

	static String greeting()
	{
		String greet = "Hello Java";
		return greet;
	}
}