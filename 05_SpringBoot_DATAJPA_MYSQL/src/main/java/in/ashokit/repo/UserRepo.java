package in.ashokit.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import in.ashokit.entity.User;

public interface UserRepo extends CrudRepository<User, Integer>{
	
	public Optional findById(Integer id);
	public List<User> findByName(String name);
	
	@Query("From User")
	public List<User> getAllUsersHQL();

	@Query(value = "select * from user_info", nativeQuery = true)
	public List<User> getAllUsersSQL();

	// select * from user_info where country=?
	public List<User> findByCountry(String country);

	// select * from user_info where country=? and gender=?
	public List<User> findByCountryAndGender(String country, String gender);



}
