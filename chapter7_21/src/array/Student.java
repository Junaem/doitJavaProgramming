package array;

public class Student {
	private static int serialNum=1000;
	private int studentID;
	public String name;
	
	public Student(String name) {
		serialNum++;
		this.studentID = serialNum;
		this.name = name;
	}
	public void showStudentInfo() {
		System.out.println(name+"ÀÇ ÇÐ¹ø: "+studentID);
	}
}
