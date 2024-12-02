package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Employee;
import in.ashokit.repo.EmployeeRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
		
		EmployeeRepository employeeRepository = ctxt.getBean(EmployeeRepository.class);
		Employee e = new Employee();
		e.setEmpId(104);
		e.setEmpName("Lipi");
		e.setEmpSalary(3000.00);
		employeeRepository.save(e);
		
	}

}
