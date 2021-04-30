package classInheritance;

public class Main {

	public static void main(String[] args) {
		UserManager userManager = new UserManager();
		userManager.add(new Student());
		userManager.add(new Instructor());
		
		Student students[]= {};
		StudentManager stdManager = new StudentManager();
		stdManager.showDetails(students);
		
		Instructor instructor[]= {};
		InstructorManager instManager = new InstructorManager();
		instManager.showDetails(instructor);
		
	}

}
