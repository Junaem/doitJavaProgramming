package aaa;

public class p148instance {
	public static void main(String[] args) {
		p141Stu student1 = new p141Stu();
		student1.studentName = "이준형";
		System.out.println(student1.studentName);
		
		p141Stu student2 = new p141Stu();
		student2.studentName = "김성찬";
		System.out.println(student2.getStudentName());
	}
}
