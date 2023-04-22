package lec03;

public class return-type{
	public static void main(String args[]){
		String msg = greeting();
		System.out.println(msg);
	}

	static String greeting()
	{
		String greet = "Hello Java";
		return greet;

	}
}


