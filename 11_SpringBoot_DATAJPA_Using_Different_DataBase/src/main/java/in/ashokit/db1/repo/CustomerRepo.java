package in.ashokit.db1.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.db1.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {
	
}
