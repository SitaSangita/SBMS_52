package in.sita.sangita.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import in.sita.sangita.repo.EmployeeRepo;
import in.sita.sangita.util.Employee;

@RestController
public class EmployeeController {
	@Autowired
	 private EmployeeRepo employeeRepo;
	@PostMapping("/employee")
	public String addEmployee(@RequestBody Employee employee) {
		
		Employee save = employeeRepo.save(employee);
		return "Employee Saved";
	}
	@GetMapping("/employees")
	public Iterable<Employee> findEmployee() {
		return employeeRepo.findAll();
	}

}
