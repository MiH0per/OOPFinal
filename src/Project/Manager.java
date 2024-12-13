package Project;

class Manager extends Employee {
    private ManagerType managerType;

    public Manager(String firstName, String lastName, String id, String login, String password, Language language, double salary, int yearOfJoin, boolean isResearcher, ManagerType managerType) {
        super(firstName, lastName, id, login, password, language, salary, yearOfJoin, isResearcher);
        this.managerType = managerType;
    }
}