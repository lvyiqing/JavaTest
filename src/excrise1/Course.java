package excrise1;

public class Course {
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}
	
	public String[] getStudents() {
		return students;
	}
	
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	public void dropStudent(String student) {
		String[] studentTemp = new String[100];
		int adx = 0;
		
		for (int i = 0; i < students.length; i++) {
			if (!student.equals(students[i])) {
				studentTemp[adx++] = students[i];
			}
		}
		
		students = studentTemp;
		numberOfStudents--;
	}
}
