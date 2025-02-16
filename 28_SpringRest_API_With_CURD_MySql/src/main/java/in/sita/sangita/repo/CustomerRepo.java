package in.sita.sangita.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sita.sangita.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{

}
