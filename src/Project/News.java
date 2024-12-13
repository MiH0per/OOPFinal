package Project;

class News {
    private String topic;
    private Comment[] comments;

    public News(String topic, Comment[] comments) {
        this.topic = topic;
        this.comments = comments;
    }
}