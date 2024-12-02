package com.ashokit.beans;

public class DebitCard implements IPayment{
	public DebitCard() {
		System.out.println("Debit card:: constructor");
	}

	@Override
	public int pay() {
		
		System.out.println("Payment done by using Debit card");
		return 1;
	}

}
