package Project;
import java.util.List;
import java.util.ArrayList;

public class Teacher extends Employee implements Researcher{
    private List<Course> courses;
    private List<ResearchPaper> publishedPapers;
    private List<ResearchProject> researchProjects; 

    public Teacher(String firstName, String lastName, String id, String login, String password, Language language,
			double salary, int yearOfJoin, boolean isResearcher, List<Course> courses,
			List<ResearchPaper> publishedPapers, List<ResearchProject> researchProjects) {
		super(firstName, lastName, id, login, password, language, salary, yearOfJoin, isResearcher);
		this.courses = new ArrayList();
		this.publishedPapers = new ArrayList<>();
        this.researchProjects = new ArrayList<>();
	}
    
    public Teacher(String firstName, String lastName, String id, String login, String password, Language language,
			double salary, int yearOfJoin, boolean isResearcher) {
		super(firstName, lastName, id, login, password, language, salary, yearOfJoin, isResearcher);
		this.courses = new ArrayList();
		this.publishedPapers = new ArrayList<>();
        this.researchProjects = new ArrayList<>();
	}



	public void addCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
    }
    

    public List<Course> getCourses() {
        return new ArrayList<>(courses);
    }

    public void setMark(Student student, Course course, double firstAtt, double secondAtt, double finalGrades) {  	
    	Marks newMark = new Marks(course, firstAtt, secondAtt, finalGrades);
        student.getTranscript().addMark(newMark);
        System.out.println(Translator.translate("addingMarks", Main.language) + " " + student.getFirstName() + " " + student.getLastName());
    }

    public void fileComplaintAboutStudent(Student student, String complaintText) {
 
    }

    public List<Student> getStudentsFromCourse(Course course) {
        return null; 
    }

    public void addLessonToCourse(Course course, Lesson lesson) {
    }
    @Override
    public void publishResearch(ResearchPaper paper) {
        publishedPapers.add(paper);
    }

    @Override
    public void participateInProject(ResearchProject project) {
        researchProjects.add(project);	
    }
    

    @Override
    public List<ResearchProject> getResearchProjects() {
        return new ArrayList<>(researchProjects);
    }

	@Override
	public List<ResearchPaper> getPublishedPapers() {
		return null;
	}

	@Override
	public String toString() {
        return "Teacher [courses=" + courses + ", publishedPapers=" + publishedPapers + ", researchProjects="
                + researchProjects + ", salary=" + salary + ", yearOfJoin=" + yearOfJoin + ", isResearcher="
                + isResearcher + ", firstName=" + firstName + ", lastName=" + lastName + ", id=" + id + ", login="
                + login + ", password=" + password + ", language=" + language + "]";
    }
	
	
 

}
