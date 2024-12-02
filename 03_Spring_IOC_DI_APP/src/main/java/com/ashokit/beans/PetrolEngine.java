package com.ashokit.beans;

public class PetrolEngine implements IEngine {
	public PetrolEngine() {

		System.out.println("PetrolEngine :: Constructor");
	}

	@Override
	public int start() {
		System.out.println("PetrolEngine Started....");
		return 1;
	}

}
