////Create a class named 'Member' having the following members:
////Data members
////1 - Name
////2 - Age
////3 - Phone number
////4 - Address
////5 - Salary
////It also has a method named 'printSalary' which prints the salary of the members.
////Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and
////'Manager' classes have data members 'specialization' and 'department' respectively. 
////Now, assign name, age, phone number, address and salary to an employee and a manager
////by making an object of both of these classes and print the same.
//
//
//
//
//
//package com.hrc.exercise;
//
//class Member{
//	
//	String name;
//	int age;
//	String phone;
//	String address;
//	int sal;
//	
//	public Member(String name, int age, String phoneNumber, String address, int sal) {
//	        this.name = name;
//	        this.age = age;
//	        this.phone = phone;
//	        this.address = address;
//	        this.sal = sal;
//	    }
//	
//	
//	public String getName() {
//		return name;
//	}
//
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//
//	public int getAge() {
//		return age;
//	}
//
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//
//	public String getPhone() {
//		return phone;
//	}
//
//
//	public void setPhone(String phone) {
//		this.phone = phone;
//	}
//
//
//	public String getAddress() {
//		return address;
//	}
//
//
//	public void setAddress(String address) {
//		this.address = address;
//	}
//
//
//	public int getSal() {
//		return sal;
//	}
//
//
//	public void setSal(int sal) {
//		this.sal = sal;
//	}
//
//
//	void printSal() {
//		System.out.println(sal);
//	}
//	
//}
//
//
////---------------------------------------------------
//
//class Employee extends Member{
//	private String specialization;
//
//    public Employee(String name, int age, String phoneNumber, String address, int salary, String specialization) {
//        super(name, age, phoneNumber, address, salary);
//        this.specialization = specialization;
//    }
//    
//    public String getSpecialization() {
//        return specialization;
//    }
//
//    public void setSpecialization(String specialization) {
//        this.specialization = specialization;
//    }
//
//	@Override
//	public String toString() {
//        return "Employee: \n" +
//                " name = " + this.getName() + '\n'  +
//                " age = " + this.getAge() +
//                " phoneNumber = " + this.getPhone() + '\n' +
//                " city = " + this.getAddress() + '\n' +
//                " salary = " + this.getSal()+ "\n"+
//                " specialization = " + specialization ;
//    }
//
//    
//}
//
//
////-----------------------------------------------------------
//
//class Manager extends Member {
//
//    private String department;
//
//    public Manager(String name, int age, String phoneNumber, String city, int salary, String department) {
//        super(name, age, phoneNumber, city, salary);
//        this.department = department;
//    }
//
//    public String getDepartment() {
//        return department;
//    }
//
//    public void setDepartment(String department) {
//        this.department = department;
//    }
//
//	@Override
//	 public String toString() {
//        return "Manager: \n" +
//                " name = " + this.getName() + '\n'  +
//                " age = " + this.getAge() +
//                " phoneNumber = " + this.getPhone() + '\n' +
//                " city = " + this.getAddress() + '\n' +
//                " salary = " + this.getSal()+ "\n"+
//                " department = " + department;
//
//    }
//    
//}
//
////--------------------------------------------------------------
//
//public class Ex2Q1 {
//	
//	
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		Employee[] employees = {
//	            new Employee("employee1", 30, "656-659-95", "London", 3800, "Java developer")
//	};
//		employees.toString();
//		
//	Manager[] managers = {
//	            new Manager("manager1", 30, "656-659-95", "London", 3800, "Java developer")
//	};
//	managers.toString();
//		
//		
//
//		
//}
//}
