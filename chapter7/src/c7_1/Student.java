package c7_1;

public class Student {
	int studentID;
	String name;
	
	public Student(int studentID, String name) {
		this.studentID = studentID;
		this.name = name;
	}
	
	public void showInfo() {
		System.out.println(studentID+","+name);
	}
	
}
