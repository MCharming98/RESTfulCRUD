package restfulcrud;

import java.util.ArrayList;
import java.util.List;

public class BlogPost {
	private String title;
	private String arthur;
	private String content;
	private List<BlogComment> comments;
	
	public BlogPost(String title, String arthur, String content) {
		this.title = title;
		this.arthur = arthur;
		this.content = content;
		comments = new ArrayList<BlogComment>();
		
	}
	
	//Setter methods
	public void setTitle(String title) {this.title = title;}
	public void setArthur(String arthur) {this.arthur = arthur;}
	public void setContent(String content) {this.content = content;}
	public void addComment(BlogComment comment) {this.comments.add(comment);}
	
	//Getter methods
	public String getTitle() {return this.title;}
	public String getArthur() {return this.arthur;}
	public String getContent() {return this.content;}
	public List<BlogComment> getComments() {return this.comments;}
	
	public void deleteComment(BlogComment comment) {
		for(int i=0; i<comments.size(); i++) {
			if(comments.get(i).equals(comment)) {comments.remove(i);}
		}
	}
	
}
