package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Employee;
import in.ashokit.repo.EmployeeRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
		
		EmployeeRepo repo = ctxt.getBean(EmployeeRepo.class);
		
		//Employee e=new Employee(101,"Sita",25000.00);
		Employee e=new Employee();
		e.setEid(101);
		e.setEName("Sita");
		e.setSalary(25000.00);
		repo.save(e);
	}

}
