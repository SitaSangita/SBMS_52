package com.ashokit.beans;

public class UPIScanner implements IPayment{

	public UPIScanner() {

		System.out.println("UPIScanner :: Constructor");
	}
	@Override
	public int pay() {

		System.out.println("Payment done by using UIPScanner");
		return 1;
	}

}
