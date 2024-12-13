package Project;

class Admin extends Employee {
    public Admin(String firstName, String lastName, String id, String login, String password, Language language, double salary, int yearOfJoin, boolean isResearcher) {
        super(firstName, lastName, id, login, password, language, salary, yearOfJoin, isResearcher);
    }

    void addUser(User user) {}
    void removeUser() {}
    void updateUser() {}
    void seeLogFiles() {}
}
