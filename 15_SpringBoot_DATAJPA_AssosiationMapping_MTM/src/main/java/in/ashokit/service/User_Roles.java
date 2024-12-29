package in.ashokit.service;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Roles;
import in.ashokit.entity.User;
import in.ashokit.repo.RolesRepo;
import in.ashokit.repo.UserRepo;

@Service
public class User_Roles {
	@Autowired
	private RolesRepo rolesRepo;
	@Autowired
	private UserRepo userRepo;
	
	public void saveUserWithRoles() {

		Roles r1 = new Roles();
		r1.setRoleName("Manager");

		Roles r2 = new Roles();
		r2.setRoleName("Admin");

		User user = new User();
		user.setUserName("Sita");
		user.setGender("female");
	//	user.setUserDob(LocalDate.now().minusYears(20));

		user.setRoles(Arrays.asList(r1, r2));
		userRepo.save(user);
	}

	public void getUserRole() {
		userRepo.findById(1);
	}
	public void deleteUserRole() {
		userRepo.deleteById(2);
	}

}
