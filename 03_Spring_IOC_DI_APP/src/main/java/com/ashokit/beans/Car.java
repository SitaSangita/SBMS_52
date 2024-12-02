package com.ashokit.beans;

public class Car {
	private IEngine eng;
	public Car() {
		System.out.println("Car:: 0-param construtor");
	}
	public Car(IEngine eng) {
		this.eng=eng;
		
	}
	public void drive(){
		int start = eng.start();
		
		
	}

}
