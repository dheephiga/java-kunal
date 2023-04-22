//adding two numbers
package lec01;
import java.util.Scanner;

public class sum{
	public static void main(String args[]){
		System.out.print("Numbers to add: ");
		Scanner in = new Scanner(System.in);
		
		int num1 = in.nextInt();
		int num2 = in.nextInt();

		System.out.println("sum is " + (num1+num2));
		
	}
}