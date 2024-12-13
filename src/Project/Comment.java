package Project;

class Comment {
    String content;
    User user;

    public Comment(String content, User user) {
        this.content = content;
        this.user = user;
    }

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
    
    

}
