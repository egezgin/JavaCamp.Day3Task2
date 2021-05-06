
public class InstructorManager extends UserManager {
	
	public InstructorManager(int numberUsers) {
		super(numberUsers);
	}
	
	public boolean add (Instructor instructor)
	{
		System.out.println("Instructor " + instructor.getName() + " added.");
		return super.add(instructor);
	}
	
	public void showNumberOfUser ()
	{
		System.out.println(this.getNumberUsers() + " Instructors registered.");
	}
}
