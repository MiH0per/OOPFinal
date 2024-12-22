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

    public void considerComplaint(Student student, Teacher teacher, UrgencyLevel urgencyLevel, Complaint complaint) {
        System.out.println(Translator.translate("consideringComplaint", Main.language));
    }

    public void deleteComment(News news, Comment comment) {
        news.deleteComment(comment);
    }

    public void pinComment(News news, Comment comment) {
        comment.setPinned(true);
        news.addPinnedComment(comment);
    }

    public void unpinComment(News news, Comment comment) {
        comment.setPinned(false);
        news.deletePinnedComment(comment);
    }
}