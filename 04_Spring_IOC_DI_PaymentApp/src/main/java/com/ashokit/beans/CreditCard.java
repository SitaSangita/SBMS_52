package com.ashokit.beans;

public class CreditCard implements IPayment{

	public CreditCard() {

		System.out.println("Credit card:: Constructor ");
	}

	@Override
	public int pay() {
		System.out.println("Payment done by Using Credit card ");
		return 1;
	}
	

}
