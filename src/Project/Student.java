package Project;

import java.util.ArrayList;
import java.util.List;

public class Student extends User implements Researcher{
    private List<Course> enrolledCourses;
    private Transcript transcript;
    private List<ResearchPaper> publishedPapers;
    private List<ResearchProject> researchProjects;
    private List<StudentOrganization> studentOrganizations;
    private final int MAX_CREDITS = 21;
    private Faculty school;

    public Student(String firstName, String lastName, String id, String login, String password, Language language, Faculty school) {
        super(firstName, lastName, id, login, password, language);
        this.publishedPapers = new ArrayList<>();
        this.researchProjects = new ArrayList<>();
        this.enrolledCourses = new ArrayList<>();
        this.transcript = new Transcript(this);
        this.school = school;
    }	
    

    
    public void registerForCourse(Course course) { 
        enrolledCourses.add(course);
        System.out.println("Successfully registered for course: " + course.getCourseName());
    }
    
    //Просмотреть учителя
    public String viewTeacherInfo(String courseName) {
        for (Course course : enrolledCourses) {
            if (course.getCourseName().equalsIgnoreCase(courseName)) {
                return "Teacher for " + courseName + ": " + course.getInstructor();
            }
        }
        return "Course not found!";
    }
    
    //Доступные кредиты
    public int getAvailableCredits() {
        int currentCredits = enrolledCourses.stream().mapToInt(Course::getCredits).sum();
        return MAX_CREDITS - currentCredits;
    }
    
    //Студ организации
    public void joinStudentOrganization(StudentOrganization organization) {
        if (!studentOrganizations.contains(organization)) {
            studentOrganizations.add(organization);
            organization.addMember(this);
        }
    }
    
    public void leaveStudentOrganization(StudentOrganization organization) {
        if (studentOrganizations.contains(organization)) {
            studentOrganizations.remove(organization);
            organization.removeMember(this);
        }
    }
    
    //Можно ли записаться на курс
    public boolean canEnrollInCourse(Course course) {
        int currentCredits = enrolledCourses.stream().mapToInt(Course::getCredits).sum();
        return currentCredits + course.getCredits() <= MAX_CREDITS;
    }
    
  
    
    public List<Course> getEnrolledCourses() {
        return new ArrayList<>(enrolledCourses);
    }
    
    public Transcript getTranscript() {
        return transcript;
    }
    
    public Faculty getSchool() {
        return school;
    }
    
    public void setSchool(Faculty school) {
        this.school = school;
    }
    
    //Посмотреть оценки
    public List<Marks> viewGradesForCourse(Course course) {
        return transcript.getMarksForCourse(course);
    }
    
    @Override
    public void publishResearch(ResearchPaper paper) {
        publishedPapers.add(paper);
    }
    
    @Override
    public List<ResearchPaper> getPublishedPapers() {
        return new ArrayList<>(publishedPapers);
    }
    
    @Override
    public void participateInProject(ResearchProject project) {
        researchProjects.add(project);
        project.addParticipant(this);
    }
    
    
    @Override
    public List<ResearchProject> getResearchProjects() {
        return new ArrayList<>(researchProjects);
    }



	@Override
	public String toString() {
		return "Student [enrolledCourses=" + enrolledCourses + ", transcript=" + transcript + ", studentOrganizations="
				+ studentOrganizations + ", school=" + school + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", id=" + id + ", login=" + login + ", password=" + password + ", language=" + language + "]";
	}
    
    
}
