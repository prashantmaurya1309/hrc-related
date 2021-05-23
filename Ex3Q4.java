//Create a program that takes an input for date as string. Convert it to following formats:
//dd/mm/yyyy
//mm/dd/yyyy



package com.hrc.exercise;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ex3Q4 {
	
//	public String convertStringToDate(Date indate)
//	{
//	   String dateString = null;
//	   SimpleDateFormat sdfr = new SimpleDateFormat("dd/MM/yyyy");
//	   /*you can also use DateFormat reference instead of SimpleDateFormat 
//	    * like this: DateFormat df = new SimpleDateFormat("dd/MMM/yyyy");
//	    */
//	   try{
//		dateString = sdfr.format( indate );
//	   }catch (Exception ex ){
//		System.out.println(ex);
//	   }
//	   return dateString;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date todaysDate = new Date();
	    DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	    DateFormat df1 = new SimpleDateFormat("mm/dd/yyyy");
		
	    try {
	    	String testDateString = df.format(todaysDate);
	        System.out.println("String in dd/MM/yyyy format is: " + testDateString);
	    }
	    catch (Exception ex ){
	          System.out.println(ex);
	    }
	}

}
