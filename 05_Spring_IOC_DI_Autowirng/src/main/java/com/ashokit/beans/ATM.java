package com.ashokit.beans;

public class ATM {
	private IPrinter printer;
	public void setPrinter(IPrinter printer) {
		this.printer=printer;
	}
	public ATM() {
		System.out.println("ATM  :: Constructor");
	}
	public void withdraw() {
		System.out.println("Balance withdraw Succesfully...");
		printer.print();
	}

}
