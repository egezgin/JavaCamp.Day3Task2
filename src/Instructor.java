
public class Instructor extends User{
	private int instructorId;
	private String[] courses;
	
	public Instructor(int id, String name, String address, int instructorId, String[] courses)
	{
		super(id, name, address);
		this.instructorId = instructorId;
		this.courses = courses;
	}

	public int getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}
}
