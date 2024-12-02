package com.ashokit.beans;

public class SpringLifeCycle {

	public SpringLifeCycle() {

		System.out.println("SpringLifeCycle::Constructor");
	}
	public void doStart(){
		System.out.println("Spring Life Cycle started");
	}
	
	public void doService() {
		System.out.println("Service method started");
	}
	public void destroy() {
		System.out.println("Spring object destroy");
	}
}
