package com.ashokit.beans;

public class Resturant {
	private IPayment epm;
	private String sts;
	public Resturant(IPayment epm, String sts) {

		System.out.println("Resturant ::Constructor");
		this.epm=epm;
		this.sts=sts;
		System.out.println("Name of String::"+this.sts);
	}
	public void bill() {
		
		int pay = epm.pay();
		if(pay>=1) {
			System.out.println("Payment deducted by ::"+epm);
		}
		else {
			System.out.println("Payment not deducted by ::"+epm);
			
		}
	}

}
