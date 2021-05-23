//Create a program that takes a decimal number (with at least 5 digits after decimal point).
//Take another input  which is the number of decimal places.
//Round off the first  number to that many decimal places.
//Use BigDecimal and its methods for solving this.





package com.hrc.exercise;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class Ex3Q3 {
	
	public static int countDecimal(String st)
	{
		String dot = ".";
		int count = 0;
		for(char c : st.toCharArray())
		{
			if(c == dot.charAt(0))
			{
				count = st.length()-st.indexOf(c);
			}
			continue;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("enter a decimal number:");
		String st = sc.next();
		if(countDecimal(st)<=5) {
			System.out.println("enter a number with 5 digit atleast after decimal");
		}
		try {
			Double d = Double.parseDouble(st);
			System.out.println(d);
		}
		catch (NumberFormatException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
