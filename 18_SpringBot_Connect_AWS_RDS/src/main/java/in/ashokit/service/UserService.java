package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.User;
import in.ashokit.repo.UserRepo;
@Service
public class UserService {
	@Autowired
	private UserRepo userRepo;
	
	public void saveUser() {
		User u=new User();
		u.setName("Sita");
		u.setGender("Female");
		u.setPhoneno(47256325l);
		userRepo.save(u);
	}

}
