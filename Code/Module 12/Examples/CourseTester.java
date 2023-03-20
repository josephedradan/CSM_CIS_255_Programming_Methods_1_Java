public class CourseTester {

	public static void main(String[] args) {
		Student s1 = new Student("Jane Doe", "Q123", true);
		Student s2 = new Student("Sam Smith", "A654", false);
		Student s3 = new Student("Al Adams", "Z777", true);
		Student s4 = new Student("Ray Jones", "K519", false);
		
		Course c = new Course("Intro to Java", 5);
		System.out.println(c);
		
		c.addStudent(s1);
		System.out.println(c);
		
		c.addStudent(s2);
		System.out.println(c);
		
		c.addStudent(s3);
		System.out.println(c);
		
		c.addStudent(s4);
		System.out.println(c);
		
		c.dropStudent(s3);
		Student s5 = new Student("Frank Fake", "F123", true);
		c.dropStudent(s5);
		System.out.println(c);
		
		c.dropAllUnpaidStudents();
		System.out.println(c);
		

	}

}
