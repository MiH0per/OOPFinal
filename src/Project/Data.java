package Project;

import java.util.*;

public class Data {
	
	private static final Vector<Admin> admins = new Vector<>();
	
	private static final Map<String, User> users = new HashMap<>();
	
	public static void addAdmin(Admin admin) {
		admins.add(admin);
		users.put(admin.getLogin(), admin);
	}
	
	public static void addUser(User u) {
//		if (users.containsKey(u.getLogin())) {
//	        System.out.println("Warning: Overwriting existing user with login: " + u.getLogin());
//	    }
	    users.put(u.getLogin(), u);
	}
	
	public static User findUser(String login) {
		if(users.containsKey(login)) return users.get(login);
		return null;
	}
	

}
