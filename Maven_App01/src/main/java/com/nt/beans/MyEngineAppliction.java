package com.nt.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyEngineAppliction {

	public static void main(String[] args) {

		ApplicationContext ctxt=
				new ClassPathXmlApplicationContext("Beans.xml");
		
		DiselEngine des = ctxt.getBean(DiselEngine.class);
		PetrolEngine pet = ctxt.getBean(PetrolEngine.class);
		des.start();
		pet.start();
	}

}
