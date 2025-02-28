package in.ashokit.repo;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import in.ashokit.entity.Employee;


public interface EmployeeRepo extends CrudRepository<Employee, Integer>{
	   
	
		@Modifying
		@Query(value = "INSERT INTO Emp_tbl (eid,name,location, salary) VALUES (:id,:name,:location,:salary)", nativeQuery = true)
	    void insertEmployee(Integer id,String name, String location, Double salary);

		
		 // Custom UPDATE
		  @Modifying
		 @Query(value="UPDATE Employee e SET e.salary=1300,e.name=:name, e.location=:location WHERE e.id =:id", nativeQuery = true) 
		  
		  void updateEmployeeSalary(Double salary,String name,String location,Integer id);
		 
		 /* // Custom DELETE
		 * 
		 * @Query("DELETE FROM Emp_Info e WHERE e.id = ?1") void
		 * deleteEmployeeById(Integer id);
		 */

}
