package restfulcrud;

public class BlogComment {
	private String user;
	private String comment;
	
	public BlogComment(String user, String comment) {
		this.user = user;
		this.comment = comment;
	}
	
	public void editComment(String comment) {
		this.comment = comment;
	}
	
	public String getUser() {
		return this.user;
	}
	
	public String getComment() {
		return this.comment;
	}
}
