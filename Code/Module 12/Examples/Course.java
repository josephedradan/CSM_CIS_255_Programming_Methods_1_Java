import java.util.*;

public class Course {
	
	private String name;
	private int capacity;
	private ArrayList<Student> studentList;
	
	public Course(String name, int capacity) {
		this.name = name;
		this.capacity = capacity;
		studentList = new ArrayList<Student>();
	}

	public boolean addStudent(Student s) {
		int numberEnrolled = studentList.size();
		if(numberEnrolled < capacity) {
			// there is room- add the student
			return studentList.add(s);
		} else {
			// no room!
			return false;
		}
	}
	public boolean dropStudent(Student s) {		
		return studentList.remove(s);
	}
	public int dropAllUnpaidStudents() {
		// cycle through the list and remove only those
		// students that haven't paid
		int droppedCount = 0;
		Iterator<Student> iterator = studentList.iterator();
		while(iterator.hasNext()) {
			Student s = iterator.next();
			boolean paid = s.isTuitionPaid();
			if(!paid) {
				iterator.remove();
				droppedCount++;
				// whenever you are iterating through a list/collection and you need to remove
				// an element, ONLY use the remove method of the iterator- NOT the underlying list/collection
			}
		}
		return droppedCount;
	}
	public boolean isEnrolled(Student s) {
		return studentList.contains(s);
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		if(capacity > 0) {
			this.capacity = capacity;
		}
	}
	@Override
	public String toString() {
		String s = "Course " + name + "\n";
		Collections.sort(studentList);
		Iterator<Student> iterator = studentList.iterator();
		while(iterator.hasNext()) {
			Student student = iterator.next();
			s += student.toString() + "\n";
		}
		return s;
	}
	
}
