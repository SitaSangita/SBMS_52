package in.sita.sangita.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sita.sangita.entity.Student;
import in.sita.sangita.rpeo.StudentRepo;

@Service
public class StudentService {
	

	@Autowired
	private StudentRepo repo;
	
	public void saveStudent() {
		Student s=new Student();
		s.setName("Manish");
		repo.save(s);
	}
}
