package com.ashokIT.beans;

import java.util.Base64;
import java.util.Base64.Encoder;


public class PwdService {
	public PwdService() {

		System.out.println("PwdService :: Constructor");
	}
	
	public String encodedPwd(String pwd) {
		Encoder encoder = Base64.getEncoder();
		String encodePwd = encoder.encodeToString(pwd.getBytes());
		
		
		return encodePwd;

		
	}

}
