package in.ashokit.db2.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.db2.entity.Bank;

public interface BankRepo extends JpaRepository<Bank, Integer>{

}
