
public class Main {

	public static void main(String[] args) {
		Student student = new Student(1, "Muhittin", "Mizrak", "eposta@gmail.com", "200");
    	StudentManager studentManager = new StudentManager();
    	studentManager.add(student);
    	studentManager.login(student);
    	studentManager.update(student);
    	studentManager.delete(student);
    	studentManager.logout(student);
    	
    	System.out.println("-----------------------------");
    	
    	Instructor instructor = new Instructor(1, "Engin", "Demirog", "eposta@gmail.com", "100", "Java");
    	InstructorManager instructorManager = new InstructorManager();
    	instructorManager.add(instructor);
    	instructorManager.login(instructor);
    	instructorManager.lesson(instructor);
    	instructorManager.update(instructor);
    	instructorManager.delete(instructor);
    	instructorManager.logout(instructor);

	}

}
