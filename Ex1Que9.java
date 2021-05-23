//11.Write a program to accept an integer n. If n is positive then only find the sum of all the numbers(natural numbers sum) till n. If n value is negative or 0 then print not a valid number




package com.hrc.exercise;

import java.util.Scanner;

public class Ex1Que9 {

	static int findSum(int n)
    {
        int sum = 0;
        for (int x = 1; x <= n; x++)
            sum = sum + x;
        return sum;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a integer");
		int n = sc.nextInt();
		
		n = n>0?findSum(n):n;
		System.out.println(n);
	}
	
}
