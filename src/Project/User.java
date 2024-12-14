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

    public User(String login, String password) {
    	this.login = login;
    	this.password = password;
    }

    boolean logIn() { return true; }
    void logOut() {}
    void changeLanguage(Language language) { this.language = language; }

    @Override
    public void update() {}
    
    
    public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLogin() {
    	return this.login;
    }
    
    public int getPassword() {
    	return this.password.hashCode();
    }
}
