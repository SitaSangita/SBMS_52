package com.ashokit.beans;

public class UserService {
	private IEmailService emailService;
	private IUserDao iUserDao;
	private IPwdService iPwdService;
	
	public UserService(IEmailService emailService, IUserDao iUserDao, IPwdService iPwdService) {
		super();
		this.emailService = emailService;
		this.iUserDao = iUserDao;
		this.iPwdService = iPwdService;
	}

	public void registration() {
		emailService.sendEmail();
		iUserDao.saveUserDao();
		iPwdService.generatePwd();
		System.out.println("registration successfull");
	}

}
