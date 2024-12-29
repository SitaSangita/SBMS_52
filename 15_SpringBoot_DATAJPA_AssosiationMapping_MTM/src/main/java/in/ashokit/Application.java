package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.log.UserLoggingService;
import in.ashokit.service.User_Roles;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run =
				SpringApplication.run(Application.class, args);
		UserLoggingService bean = 
				run.getBean(UserLoggingService.class);
		bean.saveUser();
		User_Roles user_Roles = 
				run.getBean(User_Roles.class);
		//user_Roles.saveUserWithRoles();
		//user_Roles.getUserRole();
		user_Roles.deleteUserRole();
	}

}
