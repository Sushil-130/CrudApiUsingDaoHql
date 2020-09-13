package studyeasy.org.services;

import java.util.List;

import studyeasy.org.model.Post;

public interface PostsService {

	List<Post> getPostsByUserId(int uid);

public Post getPost(int pid, int uid);

	void addPosts(int id, Post post);

	void updatePost(Post post,int pid, int uid);

	void deletePost(int pid, int uid);

}
