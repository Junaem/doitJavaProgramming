package C6_3;

public class StudentTest2 {

	public static void main(String[] args) {//p185
		
		Student1 studentLee = new Student1();
		studentLee.setStudentName("이준형");
		System.out.println(studentLee.serialNum);
		System.out.println(studentLee.studentName + " 학번: " + studentLee.serialNum);
		
		System.out.println();
		
		Student1 studentSon = new Student1();
		studentSon.setStudentName("손수경");
		System.out.println(studentSon.serialNum);
		System.out.println(studentSon.studentName + " 학번: " + studentSon.serialNum);
	}
}
