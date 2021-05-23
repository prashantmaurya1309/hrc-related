//Create a class and declare 2 variables: name and manager. 
//manager is a static variable , instantiate the variables using 
//constructors and static blocks. Create two objects and display the data.


package com.hrc.exercise;

class Temp{
	String name;
	static String manager;
	
	static {
		manager = "Prashant";
	}
	
	Temp(String name)
	{
		this.name = name;
	}

	public String displayData() {
		return "Temp [name=" + name + "]";
	}
	
}

public class Ex3Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temp t1= new Temp("asdfggh");
		Temp t2= new Temp("zxcvb");
		
		t1.displayData();
		t2.displayData();
	}

}
