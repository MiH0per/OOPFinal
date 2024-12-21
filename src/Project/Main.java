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
		
		User u1 = new Teacher("Zhumadir", "N.", "1", "n_zhumadir", "password", Language.EN, 999999.0, 2024, true);
		Teacher teacher = new Teacher("Izbassar", "A.", "2", "a_izbassar", "password2", Language.RU, 222, 2024, false);
		Course oop_course = new Course("OOP", "1231", 9, 400, CourseType.MAJOR, teacher);
		teacher.addCourse(oop_course);
		Student u2 = new Student("Maxim", "Kramarov", "230B030299", "m_kramarov", "password3", Language.EN, Faculty.SITE);
		System.out.println(u1.getFirstName());
		User admin = new Admin("Admin", "admin", "123", "admin", "admin", Language.EN, 1, 2000, false);
		System.out.println(admin.getLogin());

		Data.addUser(teacher);
		Data.addUser(u1);
		Data.addUser(u2);
		
		User current = login();
		if(current == null) System.exit(0);
		
		System.out.println();
		
		
		
		
		
		
		u2.registerForCourse(oop_course);
		teacher.setMark(u2, oop_course, 15.0, 20.0, 30.0);  
		System.out.println(u2.viewGradesForCourse(oop_course));  
		
		
		
		Transcript transcript = new Transcript(u2);
		Marks mark = new Marks(oop_course, 15.0, 20.0, 30.0);

		transcript.addMark(mark);
		System.out.println(transcript.getMarksForCourse(oop_course));
		System.out.println(transcript.calculateGPA());
		

	}

}
