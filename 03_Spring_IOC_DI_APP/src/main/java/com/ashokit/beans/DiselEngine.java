package com.ashokit.beans;

public class DiselEngine implements IEngine {
	public DiselEngine() {

		System.out.println("DiselEngine :: Constructor");
	}

	@Override
	public int start() {
		System.out.println("DiselEngine Started");
		return 1;
	}
	

}
