package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Employee;
import in.ashokit.service.EmployeeService;

@SpringBootApplication
public class Application {
	
	

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
		EmployeeService employeeService = ctxt.getBean(EmployeeService.class);
		//employeeService.addEmployee(102, "Smith","USA",1800.00);
		//employeeService.updateEmployeeServiceSalary(2000.00, "Allen","UK", 102);
		employeeService.removeEmployee(102);
	}

}
