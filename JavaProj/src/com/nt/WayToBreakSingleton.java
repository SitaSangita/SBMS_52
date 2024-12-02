package com.nt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class WayToBreakSingleton {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, FileNotFoundException, IOException, CloneNotSupportedException {
		Singleton originalSingletonObject=Singleton.getInstance();
		System.out.println("originalSingletonObject  ::"+originalSingletonObject.hashCode());
		
		Singleton duplicateSingletonObject=Singleton.getInstance();
		System.out.println("duplicateSingletonObject ::"+duplicateSingletonObject.hashCode());
		
		//reflection 
		Class<?> singletonClass=Class.forName("com.nt.Singleton");
		Constructor<Singleton> constructor=(Constructor<Singleton>) singletonClass.getDeclaredConstructor();
		constructor.setAccessible(true);
		Singleton singletonReflection=constructor.newInstance();
		
		System.out.println("originalSingletonObject  ::"+originalSingletonObject.hashCode());
		System.out.println("singletonReflection  ::"+singletonReflection.hashCode());
		
		
		
		
		constructor.setAccessible(true);
		Singleton brokenSingletoneRelfection=constructor.newInstance();
	
		//Serialization
		ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("D:\\Serilaization"));
		objectOutputStream.writeObject(originalSingletonObject);
		objectOutputStream.close();
		//deserializtion
		ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream("D:\\\\Serilaization"));
		Singleton brokenSingletonWithDserialization =(Singleton)inputStream.readObject();
		System.out.println("OriginalSingletonObject::"+originalSingletonObject.hashCode());
		System.out.println("brokenSingletonWithDserialization  ::"+brokenSingletonWithDserialization.hashCode());
		//Cloning
		Singleton singleton =(Singleton)originalSingletonObject.clone();
	}

}
