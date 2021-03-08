package aaa;

public class p141Stu {

	int studentID;
	String studentName;
	int grade;
	String address;

	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static void main(String[] args) {
		p141Stu studentLee = new p141Stu();
		studentLee.studentName = "ÀÌÁØÇü";
		
		System.out.println(studentLee.studentName);
		System.out.println(studentLee.getStudentName());
	}
}
