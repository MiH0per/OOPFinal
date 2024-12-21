package Project;

import java.util.ArrayList;
import java.util.List;

public class Transcript{
    private Student student;
    private List<Marks> marks;

    public Transcript(Student student) {
        this.student = student;
        this.marks = new ArrayList<>();
    }

    public void addMark(Marks mark) {
        marks.add(mark);
    }

    public List<Marks> getMarksForCourse(Course course) {
        List<Marks> marksForCourse = new ArrayList<>();
        for (Marks mark : marks) {
            if (mark.getCourse().equals(course)) {
                marksForCourse.add(mark);
            }
        }
        return marksForCourse;
    }

    public double calculateGPA() {
        if (marks.isEmpty()) {
            return 0.0;
        }
        double totalGradePoints = 0.0;
        int totalCredits = 0;
        for (Marks mark : marks) {
            totalGradePoints += mark.getTotalGrades();
            totalCredits += mark.getCourse().getCredits();
        }
        return totalCredits > 0 ? totalGradePoints / totalCredits : 0.0;
    }

    public Student getStudent() {
        return student;
    }
}
