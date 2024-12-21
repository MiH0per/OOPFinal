package Project;


import java.util.ArrayList;
import java.util.List;

public class Registration {
    private List<Course> availableCourses;

    public Registration() {
        availableCourses = new ArrayList<>();
    }

    public List<Course> getAvailableCourses() {
        return availableCourses;
    }

    public void addCourse(Course course) {
        availableCourses.add(course);
    }

    public void removeCourse(Course course) {
        availableCourses.remove(course);
    }

}