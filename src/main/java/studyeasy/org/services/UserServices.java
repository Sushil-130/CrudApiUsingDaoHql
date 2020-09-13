package studyeasy.org.services;

import java.util.List;

import org.springframework.stereotype.Service;

import studyeasy.org.model.User;


public interface UserServices {

	List<User> getUsers();

	User getUser(int uid);

	void addUser(User user);

	void updateUser(User user);

	void deleteUser(int uid);

}
