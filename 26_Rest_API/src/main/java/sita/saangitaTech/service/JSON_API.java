package sita.saangitaTech.service;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

import sita.sangitaTech.service.Customer;

public class JSON_API {

	public static void main(String[] args) throws Exception {

		JSON_API ja=new JSON_API();
		//ja.javaToJson();
		ja.jsonToJava();
	}
	public void javaToJson() throws Exception{
		File f=new File("Customer.json");
		Customer c=new Customer();
		c.setcId(101);
		c.setName("Sita");
		c.setPhno(452178963l);
		ObjectMapper objmap=new ObjectMapper();
		objmap.writeValue(f, c);
	}
	public void jsonToJava() throws Exception{
		File f=new File("Customer.json");
		ObjectMapper objMap=new ObjectMapper();
		
		Customer customer = objMap.readValue(f,Customer.class);
		System.out.println(customer);
	}
	

}
