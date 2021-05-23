package self.practice.javalearn;

import java.util.Scanner;

public class Ex1Que1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.Write a program to check whether user input is a number or not ?
		System.out.println("enter a number \n");
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		
		try {
			int intValue = Integer.parseInt(a);
			System.out.println("yes input is numeric");
		}
		catch(NumberFormatException e){
			System.out.println("input is not integer");
		}

	}

}
