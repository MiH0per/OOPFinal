package Project;

class Librarian extends Employee {
	private Book[] books;
	private Library library;
	private boolean isResearcher;

    public Librarian(String firstName, String lastName, String id, String login, String password, Language language, double salary, int yearOfJoin, boolean isResearcher,  Book[] books, Library library) {
        super(firstName, lastName, id, login, password, language, salary, yearOfJoin, isResearcher);
        this.books = books;
        this.library = library;
    }

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books = books;
	}

	public Library getLibrary() {
		return library;
	}

	public void setLibrary(Library library) {
		this.library = library;
	}

	public int getYearOfJoin() {
		return yearOfJoin;
	}

	public void setYearOfJoin(int yearOfJoin) {
		this.yearOfJoin = yearOfJoin;
	}

	public boolean isResearcher() {
		return isResearcher;
	}

	public void setResearcher(boolean isResearcher) {
		this.isResearcher = isResearcher;
	}
	
}
