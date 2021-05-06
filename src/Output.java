
public class Output {

	public static void main(String[] args) {
		String[] courses1 = new String[] {"Java"};
		String[] courses2 = new String[] {"Java", "C#"};
		
		User user1 = new Student(1, "Emrah Gezgin", "57th Street, NYC, USA", 1, courses1);
		user1.setId(1);
		user1.setName("Emrah Gezgin");
		user1.setAddress("57th Street, NYC, USA");
		((Student) user1).setStudentId(1);
		((Student) user1).setCourses(courses1);
				
		User user2 = new Instructor(2, "Engin Demirog", "Istanbul, Turkey", 1, courses2);
		
		UserManager userManager1 = new StudentManager(10);
		userManager1.add(user1);
		userManager1.showNumberOfUser();
		
		UserManager userManager2 = new InstructorManager(1);
		userManager2.add(user2);
		userManager2.add(user2);
		userManager2.showNumberOfUser();
		
		
	}

}
