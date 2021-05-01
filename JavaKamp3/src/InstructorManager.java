
public class InstructorManager extends UserManager {
	public void lesson(Instructor instructor) {
		System.out.println("Sayin " + instructor.getFullName() + " " + instructor.getInstructorLesson() +" Dersi Secildi.");
	}
}