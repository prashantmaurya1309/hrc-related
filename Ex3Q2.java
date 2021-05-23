//Take a comma separated string and print the individual strings separately. 
//Input: 123,abc,400.50,10009826,R
//Output:
//123
//abc
//400.50
//10009826
//R




package com.hrc.exercise;

import java.util.Scanner;

public class Ex3Q2 {

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a sting seprated by comma:");
		String st = sc.next();
		String comma =",";
		for(char c: st.toCharArray())
		{
			if(c == comma.charAt(0))
			{
				System.out.println();
				continue;
			}
			System.out.print(c);
		}
	}
}
