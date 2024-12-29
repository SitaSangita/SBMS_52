package in.sangitaIT.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sangitaIT.entity.Email;

public interface EmailRepo extends JpaRepository<Email, Integer>{

}
