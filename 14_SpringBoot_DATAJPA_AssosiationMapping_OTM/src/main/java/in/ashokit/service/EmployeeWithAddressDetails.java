package in.ashokit.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Address;
import in.ashokit.entity.Employee;
import in.ashokit.repo.AddressRepo;
import in.ashokit.repo.EmployeeRepo;

@Service
public class EmployeeWithAddressDetails {
	@Autowired
	private EmployeeRepo employeeRepo;
	@Autowired
	private AddressRepo addressRepo;
	
	public void saveEmployeeWithAddresDetails() {
		Employee e=new Employee();
		e.setGender("Female");
		e.setName("Sangita");
		e.setSalary(1456526.01);
		
		Address a1=new Address();
		a1.setCity("BBSR");
		a1.setState("Odisha");
		a1.setType("Premanent");
		

		Address a2=new Address();
		a2.setCity("Hyderabad");
		a2.setState("TG");
		a2.setType("Present");
		Address a3=new Address();
		a3.setCity("Hi-Tech");
		a3.setState("TG");
		a3.setType("Office");
		a1.setEmp(e);
		a2.setEmp(e);
		a3.setEmp(e);
		List<Address> asList = Arrays.asList(a1,a2,a3);
		e.setAddress(asList);
		Employee employee = employeeRepo.save(e);
		
		
	}

}
