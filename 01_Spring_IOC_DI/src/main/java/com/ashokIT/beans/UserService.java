package com.ashokIT.beans;

public class UserService {

	private PwdService pwdService;
	public UserService() {

		System.out.println("UserService ::Constructor");
	}
	public void setPwdService(PwdService pwdService) {
		this.pwdService=pwdService;
	}
	public void saveUser(String name , String pwd ,long phone) {
		String encodedPwd = pwdService.encodedPwd(pwd);
		System.out.println("EncodedPassWord ::"+encodedPwd);
		System.out.println("PassWord Encoded into DB");
	}
}
