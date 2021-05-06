
public class StudentManager extends UserManager {
	
	public StudentManager(int numberUsers) {
		super(numberUsers);
	}
	
	public boolean add (Student student)
	{
		System.out.println("Student " + student.getName() + " added.");
		return super.add(student);
	}
	
	public void showNumberOfUser ()
	{
		System.out.println(this.getNumberUsers() + " Students registered.");
	}
}
