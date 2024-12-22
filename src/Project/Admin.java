package Project;

class Admin extends Employee {
    public Admin(String firstName, String lastName, String id, String login, String password, Language language, double salary, int yearOfJoin, boolean isResearcher) {
        super(firstName, lastName, id, login, password, language, salary, yearOfJoin, isResearcher);
    }
    
    public Admin(String login, String password) {
		super(login, password);
		Data.addAdmin(this);
	}
    
    public void addUser(User user) {
        System.out.println(Translator.translate("addingUser", Main.language) + ": " + user);
        Data.addUser(user);
    }

    public void removeUser(String userId) {
        System.out.println(Translator.translate("removingUser", Main.language) + ": " + userId);
    }

   
    void seeLogFiles() {}
}
