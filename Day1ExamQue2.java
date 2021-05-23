package com.hrc.exercise;

import java.util.Scanner;

public class Day1ExamQue2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter age of Meenu");
		int n = sc.nextInt();
		boolean valid = n>0?true:false;
		if(valid) {
			System.out.println("Meenu gets "+n*n*n+" coins sample");
		}
		else {
			System.out.println("Invalid Age");
		}
	}

}
