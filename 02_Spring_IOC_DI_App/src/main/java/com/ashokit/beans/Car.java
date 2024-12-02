package com.ashokit.beans;

public class Car {
	private Engine eng;
	public Car() {
		System.out.println("Car :: 0-Param Constructor");
	}
	public void setEng(Engine eng) {
		this.eng = eng;
	}
	public int drive() {
		int startengine = eng.start();
		
				if(startengine>1) {
					System.out.println("Engine started...");
				}
				else {
					System.out.println("Engine problem");
				}
				return startengine;
		
	}

}
