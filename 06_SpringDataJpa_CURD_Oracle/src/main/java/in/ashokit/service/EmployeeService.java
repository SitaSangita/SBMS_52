package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.repo.EmployeeRepo;
import jakarta.transaction.Transactional;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Transactional
	public void addEmployee(Integer id ,String name, String location, Double salary) {
        employeeRepo.insertEmployee(id,name, location, salary);
    }
	
	@Transactional
	public void updateSalary(Integer id,String name,String location, Double Salary) {
	  employeeRepo.updateEmployeeSalary(Salary,name,location, id);
	}
	  
	 /* public void removeEmployee(Integer id) { empRepo.deleteEmployeeById(id); }
	 */
}
