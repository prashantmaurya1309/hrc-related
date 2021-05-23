//Create a program which takes a single alphanumeric input. Find the index
//of first occurrence of a digit and print the strings before and after the 
//digit separately with comma separation. 
//
//Input: ad1ur45 
//Output: ad,ur45
//
//Input: 2ad1ur45 
//Output:  ,ad1ur45 




package com.hrc.exercise;

import java.util.Scanner;

public class Ex3q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a alphaNumeric string:");
		String st = sc.next();
		Character ch[] = new Character[st.length()];
		for (int i=0;i<st.length();i++)
		{
			ch[i] = st.charAt(i);
		}
//		for(char c : ch)
//		{
//			Boolean flag = Character.isDigit(c);
//			if(flag) {
//				System.out.print(",");
//				continue;
//			}
//			System.out.print(c);
//		}
		for(int i=0;i<st.length();i++)
		{
			Boolean flag = Character.isDigit(st.charAt(i));
			if(flag) {
				System.out.print(",");
				for(int j=i+1;j<st.length();j++)
				{
					System.out.print(ch[j]);
				}
				break;
			}
			System.out.print(ch[i]);
		}
		
	}

}
