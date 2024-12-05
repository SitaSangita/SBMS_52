package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Company;
import in.ashokit.entity.Employee;
import in.ashokit.repo.CompanyRpeo;
import in.ashokit.repo.EmployeeRepo;
import jakarta.transaction.Transactional;

@Service
public class TranxactionManagement {
	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Autowired
	private CompanyRpeo companyRpeo;
	public TranxactionManagement() {
		// TODO Auto-generated constructor stub
	}
	@Transactional(rollbackOn = Exception.class)
	public void saveTranxactionDetails() {
		Employee e=new Employee();
		e.setEName("Sangita");
		e.setGender("Female");
		e.setSalary(15243.06);
		e.setDept("TM");
		e.setCName("IBM");
		employeeRepo.save(e);
		int a=10/0;
		Company c=new Company();
		c.setCName("IBM");
		c.setLocation("HYD");
		c.setDept("TM");
		companyRpeo.save(c);
		
	}

}
