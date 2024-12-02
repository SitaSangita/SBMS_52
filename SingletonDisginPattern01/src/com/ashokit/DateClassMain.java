package com.ashokit;

public class DateClassMain {

	public static void main(String[] args) {
		JavaDateUtils du=JavaDateUtils.getInstance();
		System.out.println(du.hashCode());
		JavaDateUtils du1=JavaDateUtils.getInstance();
		System.out.println(du1.hashCode());
		System.out.println(DateClassMain.class);

	}
}

