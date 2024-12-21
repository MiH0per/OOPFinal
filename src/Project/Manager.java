package Project;

class Manager extends Employee {
    private ManagerType managerType;
    private Registration registration = new Registration();

    public Manager(String firstName, String lastName, String id, String login, String password, Language language, double salary, int yearOfJoin, boolean isResearcher, ManagerType managerType) {
        super(firstName, lastName, id, login, password, language, salary, yearOfJoin, isResearcher);
        this.managerType = managerType;
    }


    public boolean approveRegistration(Course course) {
        if (registration.getAvailableCourses().contains(course)) {
            return true;
        }
        return false;
    }

    public void addCourseForRegistration(Course course) {
        registration.addCourse(course);
    }

    public void assignCourseToTeacher(Course course, Teacher teacher) {
        course.setInstructor(teacher);
    }
}