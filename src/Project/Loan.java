package Project;

class Loan {
    private Book book;
    private Student student;
    private String borrowedDate;
    private String dueDate;

    public Loan(Book book, Student student, String borrowedDate, String dueDate) {
        this.book = book;
        this.student = student;
        this.borrowedDate = borrowedDate;
        this.dueDate = dueDate;
    }
}

