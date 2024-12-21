package Project;

class Employee extends User {
    double salary;
    int yearOfJoin;
    boolean isResearcher;

    public Employee(String firstName, String lastName, String id, String login, String password, Language language, double salary, int yearOfJoin, boolean isResearcher) {
        super(firstName, lastName, id, login, password, language);
        this.salary = salary;
        this.yearOfJoin = yearOfJoin;
        this.isResearcher = isResearcher;
    }
    
    public Employee(String login, String password) {
    	super(login, password);
    	Data.addUser(this);
    }



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
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