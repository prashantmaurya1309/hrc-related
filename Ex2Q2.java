package com.hrc.exercise;

import java.util.Random;

interface Car{
	String cars[]= {"Swift", "Bolero", "Scorpio", "BMW X5"};
}

class CarLottery implements Car{
	 static String getCar(String cars[]) {
	    int ranCar = new Random().nextInt(cars.length);
	    
	    return cars[ranCar];
}

public static class Ex2Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String randomCar= getCar(cars);
		System.out.println("Car selected randomly is :"+randomCar);
	}

}}

