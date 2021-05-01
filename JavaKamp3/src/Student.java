
public class Student extends User {
	
	private String studentNumber;
	

	public Student(int id, String firstName, String lastName, String email, String studentNumber) {
		super(id, firstName, lastName, email);
		this.studentNumber = studentNumber;
	}

	public String getPhoneNumber() {
		return studentNumber;
	}

	public void setPhoneNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
}
