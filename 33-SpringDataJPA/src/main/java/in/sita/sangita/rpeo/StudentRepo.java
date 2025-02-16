package in.sita.sangita.rpeo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sita.sangita.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}
