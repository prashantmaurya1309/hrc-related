//Take an input and find if the input is a number or not using exception handling.
//If it is not a number reverse the string and print it.


package com.hrc.exercise;

import java.util.Scanner;

public class Ex3Q5 {
	
	static boolean numberOrNot(String input)
	{
	    try
	    {
	        Integer.parseInt(input);
	    }
	    catch(NumberFormatException ex)
	    {
	        return false;
	    }
	    return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		
		String st = sc.next();
		if(numberOrNot(st))
		{
			System.out.println("it is a number "+st);
		}
		else {
			 byte[] strAsByteArray = st.getBytes();
			 
		     byte[] result = new byte[strAsByteArray.length];
		 

		     for (int i = 0; i < strAsByteArray.length; i++)
		    	 result[i] = strAsByteArray[strAsByteArray.length - i - 1];
		 
		     System.out.println(new String(result));
		}
	}

}
