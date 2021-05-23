package com.hrc.exercise;

import java.util.Scanner;

public class Ex1Que2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2.Write a program to reverse a String without using reverse function?
		

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string: ");
		String input = sc.next();
		short end = (short) (input.length());
		for(short i=end;i>0;i--)
		{
			System.out.println(input.charAt(i-1));
		}

	}

}
