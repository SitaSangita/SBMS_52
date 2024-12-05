package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.service.ServiceProvider;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = 
				SpringApplication.run(Application.class, args);
		ServiceProvider serviceProvider = 
				run.getBean(ServiceProvider.class);
		serviceProvider.saveBankDetails();
		
		serviceProvider.saveCustomerDeatil();
	}

}
