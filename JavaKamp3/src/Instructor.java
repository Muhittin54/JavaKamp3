
public class Instructor extends User{
	private String instructorNumber;
	private String instructorLesson;

	public Instructor(int id, String firstName, String lastName, String email, String instructorNumber, String instructorLesson) {
		super(id, firstName, lastName, email);
		this.instructorNumber = instructorNumber;
		this.instructorLesson = instructorLesson;
	}

	public String getInstructorNumber() {
		return instructorNumber;
	}

	public void setInstructorNumber(String instructorNumber) {
		this.instructorNumber = instructorNumber;
	}

	public String getInstructorLesson() {
		return instructorLesson;
	}

	public void setInstructorLesson(String instructorLesson) {
		this.instructorLesson = instructorLesson;
	}
}
