package studyeasy.org.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import studyeasy.org.model.Post;


@Repository
public interface PostRepository extends CrudRepository<Post,Integer> {
	
	public List<Post> findByUserId(int id);
	public Post findByIdAndUserId(int postId,int userId);
}

