package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.service.PersonAadharDetails;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt =
				SpringApplication.run(Application.class, args);
		PersonAadharDetails bean =
				ctxt.getBean(PersonAadharDetails.class);
		//bean.savePersonAadharDeatails();
		//bean.getPersonAddresDetails();
		bean.deletePersonAadharDetails();
	}

}
