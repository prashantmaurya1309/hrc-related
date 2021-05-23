//package com.hrc.exercise;
//
//
//class Member {
//	 String name, address, phoneNumber;
//	 int age, salary;
//
//	Member(String nm, String phno, String add, int a, int sal) {
//		name = nm;
//		phoneNumber = phno;
//		address = add;
//		age = a;
//		salary = sal;
//	}
//
//	 void printSalary() {
//		System.out.println("Salary of " + name + " is: " + salary);
//	}
//}
//
//class Employee extends Member {
//	 String specialization, department;
//
//	Employee(String nm, String phno, String add, int a, int sal, String sp, String dept) {
//		super(nm, phno, add, a, sal);
//		specialization = sp;
//		department = dept;
//
//	}
//}
//
//class Manager extends Member {
//	String specialization, department;
//
//	Manager(String nm, String phno, String add, int a, int sal, String sp, String dept) {
//		super(nm, phno, add, a, sal);
//		specialization = sp;
//		department = dept;
//	}
//}
//
//public class Ques1 {
//	public static void main(String[] args) {
//		Employee emp = new Employee("Pankaj", "987747213", "Bhubaneswar", 24, 50000, "SDE", "Web-Dev");
//		Manager mng = new Manager("Rakesh", "9873437213", "Cuttack", 28, 70000, "Bussiness Managre", "HR");
//
//		System.out.println("Name: " + emp.name);
//		System.out.println("Phone Number: " + emp.phoneNumber);
//		System.out.println("Address: " + emp.address);
//		System.out.println("Age: " + emp.age);
//		System.out.println("Specialization: " + emp.specialization);
//		System.out.println("Department : " + emp.department);
//		emp.printSalary();
//		System.out.println("Name: " + mng.name);
//		System.out.println("Phone Number: " + mng.phoneNumber);
//		System.out.println("Address: " + mng.address);
//		System.out.println("Age: " + mng.age);
//		System.out.println("Specialization: " + mng.specialization);
//		System.out.println("Department : " + mng.department);
//		mng.printSalary();
//	}
//
//}
