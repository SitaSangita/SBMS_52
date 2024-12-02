package com.ashokit;

public class JavaDateUtils {
	
	public static JavaDateUtils instance=null;
	//lazyInitializtion
	//Create constructor as private 
	private JavaDateUtils() {

		System.out.println("JavaDateUtils::Constructor");
		
	}
	//create a static method
	public static JavaDateUtils getInstance() {
		if(instance==null) {
			
			instance=new JavaDateUtils();
		}
		return instance;
	}

}
