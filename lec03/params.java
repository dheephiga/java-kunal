package lec03;

import java.util.Scanner;

public class params{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		System.out.println("Enter two numbers: ");
		int n = in.nextInt();
		int n1 = in.nextInt();
		int sum = addition(n,n1);
		System.out.println("The sum of two numbers is "+ sum);

	}
	static int addition(int a, int b){
		return (a+b);
	}

}