package com.hrc.exercise;
//
//class Shape {
//	
//	void volume(float side) {
//		System.out.println("Volume of the cube is : "+(side*side*side));
//	}
//	void volume(float radius,float height) {
//		System.out.println("Volume of the cylinder is: "+(3.14*radius*radius*height));
//	}
//	void volume(float length,float breadth,float height) {
//		System.out.println("Volume of the cuboid is :"+(length*breadth*height));
//	}
//	
//}
//
//public class Ques3{
//	public static void main(String[] args) {
//		Shape cuboid = new Shape();
//		cuboid.volume(3,5,7);
//	}
//	
//}
//
//
class volume
{
public void vol(int side)
{
int area=side*side*side;
System.out.println("area of the cube="+area);
}
public void vol(int l,int b,int h)
{
int are=l*b*h;
System.out.println("area of the cuboid ="+are);
}
public void vol(double r)
{
double sp=4.0/3*3.14*r*r*r;
System.out.println("area of the sphere="+sp);
}
public static void main()
{
volume ob = new volume();
ob.vol(4);
ob.vol(2,4,3);
ob.vol(2.0);
}
}
