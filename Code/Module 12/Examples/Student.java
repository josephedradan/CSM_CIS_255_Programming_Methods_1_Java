public class Student implements Comparable<Student> {
	private String name, id;
	private boolean tuitionPaid;

	public Student(String name, String id, boolean tuitionPaid) {
		this.name = name;
		this.id = id;
		this.tuitionPaid = tuitionPaid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public boolean isTuitionPaid() {
		return tuitionPaid;
	}
	public void setTuitionPaid(boolean tuitionPaid) {
		this.tuitionPaid = tuitionPaid;
	}
	@Override
	public String toString() {
		String s = "Name: " + name;
		s += "\tID: " + id;
		s += (tuitionPaid ? "\tPaid" : "\tUnpaid");
		return s;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student other = (Student) obj;
			return name.equalsIgnoreCase(other.name) && id.equalsIgnoreCase(other.id)
					&& tuitionPaid==other.tuitionPaid;
		} else {
			return false;
		}
	}
	@Override
	public int compareTo(Student otherStudent) {
		return name.compareTo(otherStudent.name);
	}

}
