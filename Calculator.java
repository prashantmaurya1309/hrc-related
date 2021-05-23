package self.practice.javalearn;

import java.util.Scanner;;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the principle amount:");
		int p = sc.nextInt();
		System.out.println("principle is "+p);
		System.out.println("r: ");
		float r = sc.nextFloat();
		System.out.println("time: ");
		int time = sc.nextInt();
		float res =  (float) (p*(r*Math.pow(1+r, time)/Math.pow(1+r, time)-1));
		System.out.println("total amount generated: "+res);
		
	}

}
