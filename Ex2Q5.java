package com.hrc.exercise;

class Emp{
	private
		int employeeId;
		String name;
		String gender;
		String city;
		
	public
		Emp(int e,String name,String g,String c) {
		this.employeeId=e;
		this.name=name;
		this.gender=g;
		this.city = c;
	}

	@Override
	public String toString() {
		return "Emp [employeeId=" + employeeId + ", name=" + name + ", gender=" + gender + ", city=" + city + "]";
	}
	

}

public class Ex2Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Emp emp1 = new Emp(12417,"Prashant Maurya","Male","Kanpur");
		System.out.println(emp1.toString());
	}

}
