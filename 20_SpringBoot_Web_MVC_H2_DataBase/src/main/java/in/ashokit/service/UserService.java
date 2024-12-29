package in.ashokit.service;

import java.util.List;

import in.ashokit.entity.User;

public interface UserService {
	
	public boolean saveUser(User user);
	public List<User> getAllUsers();
	
	public User getUserById(Integer id);
	public boolean deleteUserById(Integer id);

}