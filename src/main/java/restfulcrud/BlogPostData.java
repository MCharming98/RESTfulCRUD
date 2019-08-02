package restfulcrud;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BlogPostData {
	
	// Mapping the title to the blog post, assuming no duplicate title for now
	// Map key could be an id for the blog post instead of title
	private static Map<String, BlogPost> blogPosts;
	
	static { // ctor
		blogPosts = new HashMap<String, BlogPost>();
		// Test posts
		BlogPost test1 = new BlogPost("Test1", "Chen", "test1");
		BlogPost test2 = new BlogPost("Test2", "Chen", "test2");
		BlogPost test3 = new BlogPost("Test3", "Chen", "test3");
		blogPosts.put(test1.getTitle(), test1);
		blogPosts.put(test2.getTitle(), test2);
		blogPosts.put(test3.getTitle(), test3);
	}
	//Create
	public static void addBlogPost(BlogPost post) {
		blogPosts.put(post.getTitle(), post);
	}
	//Read
	public static BlogPost getBlogPost(String title) {
		return blogPosts.get(title);
	}
	//Update, assuming title is fixed
	public static void updateBlogPost(BlogPost post) {
		blogPosts.replace(post.getTitle(), post);
	}
	//Delete
	public static void deleteBlogPost(String title) {
		blogPosts.remove(title);
	}
	
	public static Collection<BlogPost> getAllBlogPosts() {
		 return blogPosts.values();
	}
}
