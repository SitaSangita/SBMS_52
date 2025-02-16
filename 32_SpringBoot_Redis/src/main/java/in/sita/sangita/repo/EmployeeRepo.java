package in.sita.sangita.repo;

import org.springframework.data.repository.CrudRepository;

import in.sita.sangita.util.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Integer>{

}
