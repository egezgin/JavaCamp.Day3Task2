
public class UserManager {
	private User[] users;
	private int numberUsers = 0;
	
	public UserManager() {}
	
	public UserManager(int numberUsers) {
		this.users = new User[numberUsers];
	}

	public boolean add (User user)
	{
		if (this.numberUsers >= users.length)
		{
			System.out.println("No space for new users available.");
			return false;
		}
		
		this.users[this.numberUsers] = user;
		this.numberUsers++;
		
		return true;
	}
	
	public void showNumberOfUser ()
	{
		System.out.println(this.getNumberUsers() + " Users registered.");
	}

	public User[] getUsers() {
		return this.users;
	}

	public void setUsers(User[] users) {
		this.users = users;
	}

	public int getNumberUsers() {
		return numberUsers;
	}
}
