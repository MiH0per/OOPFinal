package Project;

import java.util.ArrayList;
import java.util.List;

class Employee extends User implements Researcher {
    double salary;
    int yearOfJoin;
	private List<ResearchPaper> publishedPapers;
	private List<ResearchProject> researchProjects;
    boolean isResearcher;

    public Employee(String firstName, String lastName, String id, String login, String password, Language language, double salary, int yearOfJoin, boolean isResearcher) {
        super(firstName, lastName, id, login, password, language, isResearcher);
        this.salary = salary;
        this.yearOfJoin = yearOfJoin;
    }
    
    public Employee(String login, String password) {
    	super(login, password);
    	Data.addUser(this);
    }

	@Override
	public void publishResearch(ResearchPaper paper) {
		publishedPapers.add(paper);
	}

	@Override
	public void participateInProject(ResearchProject project) throws NotResearcherException {
		researchProjects.add(project);
		project.addParticipant(this);
	}

	@Override
	public List<ResearchProject> getResearchProjects() {
		return new ArrayList<>(researchProjects);
	}

	@Override
	public List<ResearchPaper> getPublishedPapers() {
		return null;
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