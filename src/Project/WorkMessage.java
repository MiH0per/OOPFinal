package Project;

class WorkMessage {
    private int messageId;
    private String content;
    private String dateSent;
    private Librarian sentBy;

    public WorkMessage(int messageId, String content, String dateSent, Librarian sentBy) {
        this.messageId = messageId;
        this.content = content;
        this.dateSent = dateSent;
        this.sentBy = sentBy;
    }
}