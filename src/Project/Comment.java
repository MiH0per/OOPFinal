package Project;

class Comment {
    private String content;
    private User user;
	private boolean isPinned;

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

	public void setPinned(boolean isPinned) {
		this.isPinned = isPinned;
	}

}
