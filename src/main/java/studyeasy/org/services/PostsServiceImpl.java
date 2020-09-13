package studyeasy.org.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import studyeasy.org.model.Post;
import studyeasy.org.model.User;
import studyeasy.org.repository.PostRepository;
import studyeasy.org.repository.UserRepository;

@Service
public class PostsServiceImpl implements PostsService {
	
@Autowired
	private PostRepository postRepository;

@Autowired
private UserRepository userRepository;

	@Override
	public List<Post> getPostsByUserId(int uid) {
//		List<Post> listPost=new ArrayList<>();
//		
//		for(Post post:postRepository.findByUserId(uid)) {
//			
//			listPost.add(post);
//		}
		
		return postRepository.findByUserId(uid);
	}

	@Override
	public void addPosts(int id, Post post) {
		
		User user=userRepository.findById(id).get();
		post.setUser(user);
		postRepository.save(post);
		
	}

	@Override
	public void updatePost(Post post,int pid, int uid) {
		
		Post post1=postRepository.findByIdAndUserId(pid, uid);
		
		post1.setBody(post.getBody());
		
		postRepository.save(post1);
		
	}

	@Override
	public Post getPost(int pid, int uid) {
		
		return  postRepository.findByIdAndUserId(pid, uid);
	}

	@Override
	public void deletePost(int pid, int uid) {
		
		Post post=postRepository.findByIdAndUserId(pid, uid);
		postRepository.delete(post);
		
	}
	

}
