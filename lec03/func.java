package lec03;

import java.util.Scanner;

public class func{
	public static void main(String args[]){
		sum();
	}

	static void sum()
	{
		Scanner num = new Scanner(System.in);
		System.out.print("Number1: ");
		int n1 = num.nextInt();

		System.out.print("Number2: ");
		int n2 = num.nextInt();

		int sum = n1+n2;

		System.out.println("Sum of " + n1 + " + " + n2 + " is " + sum);
	}
}