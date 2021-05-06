
public class Student extends User{
	private int studentId;
	private String[] courses;
	
	public Student(int id, String name, String address, int studentId, String[] courses)
	{
		super(id, name, address);
		this.studentId = studentId;
		this.courses = courses;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}
}
