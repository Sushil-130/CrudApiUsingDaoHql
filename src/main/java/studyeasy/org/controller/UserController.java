package studyeasy.org.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import studyeasy.org.model.User;
import studyeasy.org.services.UserServices;

@RestController
@RequestMapping("/store")
public class UserController {

	@Autowired
	private UserServices userServices;
	
	@RequestMapping("/users")
	public List<User> getUsers(){
		
		return userServices.getUsers();
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/users/{uid}")
	
	public User getUser(@PathVariable("uid") int uid) {
		
		return userServices.getUser(uid);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/users")
	
	public void addUser(@RequestBody User user) {
		
		 userServices.addUser(user);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/users/{uid}")

	public void updateUser(@RequestBody User user) {
		
		userServices.updateUser(user);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/users/{uid}")
	
		public void deleteUser(@PathVariable("uid") int uid) {
	userServices.deleteUser(uid);
}
}
