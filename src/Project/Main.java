package Project;

import java.util.Scanner;

public class Main {
	
	private static Scanner inp = new Scanner(System.in);
	
	private static User login() {
		System.out.println("Welcome to platform!");
		
		System.out.print("Login: ");
		String login = inp.next();
		
		User u = Data.findUser(login);
		if(u == null) {
			System.out.println("User is not found");
			return null;
		}
		
		System.out.print("Password: ");
		String password = inp.next();
		
		while (password.hashCode() != u.getPassword()) {
			System.out.println("Incorrect password (0 to leave)");
			System.out.println("Password: ");
			password = inp.next();
			if (password.equals("0")) return null;
		}
		
		System.out.println("Input is correct, Loginning...");
		return u;
		
		
	}

	public static void main(String[] args) {

	}

}
