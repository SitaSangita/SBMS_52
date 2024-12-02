package com.nt;

import java.io.Serializable;

public class Singleton implements Serializable , Cloneable{
	private static Singleton singleton=null;
	private Singleton() {
		
	}
	public static Singleton getInstance() {
		if(singleton==null) {
			singleton=new Singleton();
		}
		return singleton;
	}

}
