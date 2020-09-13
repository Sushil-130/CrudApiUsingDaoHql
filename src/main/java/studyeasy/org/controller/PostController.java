package studyeasy.org.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import studyeasy.org.model.Post;
import studyeasy.org.model.User;
import studyeasy.org.services.PostsService;
import studyeasy.org.services.UserServices;

@RestController
@RequestMapping("/store")
public class PostController {
	



	@Autowired
	private PostsService postsService;
	
	@RequestMapping("/users/{uid}/posts")
	public List<Post> getPostsByUserId(@PathVariable("uid") int uid ){
		
		return postsService.getPostsByUserId(uid);
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/users/{uid}/posts/{pid}")
	
	public Post getPost(@PathVariable("uid") int uid,@PathVariable("pid") int pid) {
		
		return postsService.getPost(pid,uid);
	}
//	
	@RequestMapping(method=RequestMethod.POST,value="/users/{id}/posts")
	
	public void addUser(@RequestBody Post post,@PathVariable("id") int id) {
		
		 postsService.addPosts(id,post);
	}
//	
	@RequestMapping(method=RequestMethod.PUT,value="/users/{uid}/posts/{pid}")

	public void updatePost(@RequestBody Post post,@PathVariable("uid") int uid,@PathVariable("pid") int pid) {
		
		postsService.updatePost(post,pid,uid);
	}
//	
	@RequestMapping(method=RequestMethod.DELETE,value="/users/{uid}/posts/{pid}")
	
		public void deletePost(@PathVariable("pid") int pid,@PathVariable("uid") int uid) {
	postsService.deletePost(pid,uid);
}

}

