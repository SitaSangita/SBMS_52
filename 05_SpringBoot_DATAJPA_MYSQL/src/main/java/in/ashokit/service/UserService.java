package in.ashokit.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.util.SystemPropertyUtils;

import in.ashokit.entity.User;
import in.ashokit.repo.UserRepo;

@Service
public class UserService {
	private UserRepo userRepo;
	
	public UserService(UserRepo userRepo) {
		this.userRepo=userRepo;
	}
	public void deleteUser(Integer uId){
		userRepo.deleteById(uId);
	}
	
	public void deleteAllUser() {
		userRepo.deleteAll();
	}
	public void saveUsers() {
		
		 User u1=new User();
		 u1.setId(101);
		 u1.setName("Sita");
		 u1.setGender("Female");
		 u1.setCountry("India");
		// userRepo.save(u1);

		 User u2=new User();
		 u2.setId(102);
		 u2.setName("Jayasree");
		 u2.setGender("Female");
		 u2.setCountry("USA");
		// userRepo.save(u2);

		 User u3=new User();
		 u3.setId(103);
		 u3.setName("Lipina");
		 u3.setGender("Female");
		 u3.setCountry("UK");
		// userRepo.save(u3);

		 User u4=new User();
		 u4.setId(104);
		 u4.setName("Subha");
		 u4.setGender("Female");
		 u4.setCountry("China");
		 userRepo.save(u4);
		 User u5=new User();
		 u5.setId(105);
		 u5.setName("Gita");
		 u5.setGender("Female");
		 u5.setCountry("Japan");
		// userRepo.save(u5);
		 User u6=new User();
		 u6.setId(106);
		 u6.setName("Rita");
		 u6.setGender("Female");
		 u6.setCountry("India");
		 Iterable<User> u = Arrays.asList(u1,u2,u3,u4,u5,u6);
		 userRepo.saveAll(u);
	}
	public void saveUser() {
		 User u=new User();
		 u.setId(102);
		 u.setName("Jayasree");
		 u.setGender("Female");
		 u.setCountry("India");
		 User save = userRepo.save(u);
		 System.out.println(save);
	 }
	public void findUserById(Integer uid) {
		Optional byId = userRepo.findById(uid);
		System.out.println(byId);
	}
	public void exitUserById(Integer uid) {
		boolean existsById = userRepo.existsById(uid);
		System.out.println(existsById);
	}
	public void findAllUsers() {
		Iterable<User> u =
				userRepo.findAll();
		System.out.println(u);
	}
	public void getUserName(String name) {
		List<User> byName = userRepo.findByName(name);
		System.out.println(byName);
	}
	public void getAllUsers() {
		List<User> hql = userRepo.getAllUsersHQL();
		System.out.println(hql);
	}
}
