package Project;

import java.util.ArrayList;
import java.util.List;

class News {
    private String topic;
    private List<Comment> comments;
    private List<Comment> pinnedComments;

    public News(String topic, Comment[] comments) {
        this.topic = topic;
        this.comments = new ArrayList<Comment>();
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public void addPinnedComment(Comment comment) {
        pinnedComments.add(comment);
    }

    public void deleteComment(Comment comment) {
        comments.remove(comment);
    }

    public void deletePinnedComment(Comment comment) {
        pinnedComments.remove(comment);
    }

    public List<Comment> getComments() {
        return comments;
    }
    public List<Comment> getPinnedComments() {
        return pinnedComments;
    }
}