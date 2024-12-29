package in.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.User;
import in.ashokit.repo.UserRepo;
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepo userRepo;
	@Override
	public boolean saveUser(User user) {
		User usersaved=userRepo.save(user);
		return usersaved.getId()!=null;
	}

	@Override
	public List<User> findAllUser() {
		return userRepo.findAll();
	}

	@Override
	public void editUserById(Integer uId) {
		userRepo.findById(uId);
		
	}

	@Override
	public void deleteUserById(Integer uId) {
		userRepo.deleteById(uId);
	}

	
}
