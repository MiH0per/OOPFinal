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

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getBorrowedDate() {
		return borrowedDate;
	}

	public void setBorrowedDate(String borrowedDate) {
		this.borrowedDate = borrowedDate;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
    
    
}

