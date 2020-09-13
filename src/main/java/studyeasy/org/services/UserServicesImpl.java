package studyeasy.org.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import studyeasy.org.model.User;
import studyeasy.org.repository.UserRepository;

@Service
public class UserServicesImpl implements UserServices {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> getUsers() {
		
		List<User> listUser=new ArrayList<>();
		for(User user:userRepository.findAll()) {
			
			listUser.add(user);
		}
		return listUser;
	}

	@Override
	public User getUser(int uid) {
		
		User user=userRepository.findById(uid).get();
		return user;
	}

	@Override
	public void addUser(User user) {
		
		userRepository.save(user);
		
	}

	@Override
	public void updateUser(User user) {
		userRepository.save(user);
		
	}

	@Override
	public void deleteUser(int uid) {
	userRepository.deleteById(uid);
		
	}

}
