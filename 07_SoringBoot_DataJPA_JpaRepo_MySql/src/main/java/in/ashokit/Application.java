package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.service.PersonService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				SpringApplication.run(Application.class, args);
		PersonService personService =
				context.getBean(PersonService.class);
		//Save all record iin DB table
		//personService.savePerson();
		//Sorting in descending order
		//personService.sortPersonByDescending();
		//QBE
		//personService.getQBEPerson("USA", "Male");
		//pagination
		personService.paginationByPersonRecord();
	}
}