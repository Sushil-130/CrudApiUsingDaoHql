package studyeasy.org.repository;

import org.springframework.data.repository.CrudRepository;

import studyeasy.org.model.User;

public interface UserRepository extends CrudRepository<User,Integer> {


	
}
