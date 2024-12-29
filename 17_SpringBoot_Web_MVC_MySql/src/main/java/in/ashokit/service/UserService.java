package in.ashokit.service;

import java.util.List;

import in.ashokit.entity.User;

public interface UserService {
	public boolean saveUser(User user);
	public List<User> findAllUser();
	
	public void editUserById(Integer uId);
	public void deleteUserById(Integer uId);
	
	
	
	

}
