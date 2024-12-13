package Project;

class User implements Observer {
    String firstName;
    String lastName;
    String id;
    String login;
    String password;
    Language language;

    public User(String firstName, String lastName, String id, String login, String password, Language language) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.login = login;
        this.password = password;
        this.language = language;
    }


    boolean logIn() { return true; }
    void logOut() {}
    void changeLanguage(Language language) { this.language = language; }

    @Override
    public void update() {}
}
