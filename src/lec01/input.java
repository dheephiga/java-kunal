package lec01;

import java.util.Scanner;

public class input{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter input as some number: ");
		int rollno = input.nextInt();
		System.out.println("You're Input is " + rollno);
	}
}