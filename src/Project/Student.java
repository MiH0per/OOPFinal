package Project;

import java.util.ArrayList;
import java.util.List;

public class Student extends User{
    private List<Course> enrolledCourses;
    private Transcript transcript;
    private List<ResearchPaper> publishedPapers;
    private List<ResearchProject> researchProjects;
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
}
