package restfulcrud;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.google.gson.Gson;

@Path("blogPosts")
public class BlogPostService {
	Gson gson = new Gson();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getAllBlogPosts() {
		return gson.toJson(BlogPostData.getAllBlogPosts());
	}
	
	@GET
	@Path("{title}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getBlogPost(@PathParam("title") String title) {
		return gson.toJson(BlogPostData.getBlogPost(title));
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public void createBlogPost(@FormParam("title") String title, @FormParam("arthur") String arthur, @FormParam("content") String content) {
		BlogPost post = new BlogPost(title, arthur, content);
		BlogPostData.addBlogPost(post);
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public void updateBlogPost(@FormParam("title") String title, @FormParam("content") String content) {
		BlogPostData.getBlogPost(title).setContent(content);
	}
	
	@DELETE
	@Path("{title}")
	public void deleteBlogPost(@PathParam("title") String title) {
		BlogPostData.deleteBlogPost(title);
	}
}
