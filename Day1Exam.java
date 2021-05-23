// FOR A NUMBER PRINT ITS ASCII VALUE eg- 66-A,101-e


package com.hrc.exercise;

import java.util.Scanner;

public class Day1Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of ASCII code you will enter");
		int n = sc.nextInt();
		
		for (int i=0;i<n;i++)
		{
			int num = sc.nextInt();
			char temp = (char)num;
			System.out.println(num+"-"+temp);
		}
	}

}
