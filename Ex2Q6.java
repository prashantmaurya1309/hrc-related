//Create an abstract class Shape with a method displayShape.
//Now create 2 classes Circle and Square. Inherit the abstract class and
//define the method displayShape to print the shape.(Eg This is a Circle/Square).


package com.hrc.exercise;

abstract class Shape{
	abstract void displayShape();
	
}

class Circle extends Shape{
	void displayShape() {
		System.out.println("This is a circle");
	}
}

class Square extends Shape{
	void displayShape() {
		System.out.println("This is a square");
}

public class Ex2Q6 {

	public void main(String[] args) {
		// TODO Auto-generated method stub

		Circle circle = new Circle();
		circle.displayShape();
	}

}
}
