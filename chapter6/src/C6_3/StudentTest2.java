package C6_3;

public class StudentTest2 {

	public static void main(String[] args) {//p185
		
		Student1 studentLee = new Student1();
		studentLee.setStudentName("������");
		System.out.println(studentLee.serialNum);
		System.out.println(studentLee.studentName + " �й�: " + studentLee.serialNum);
		
		System.out.println();
		
		Student1 studentSon = new Student1();
		studentSon.setStudentName("�ռ���");
		System.out.println(studentSon.serialNum);
		System.out.println(studentSon.studentName + " �й�: " + studentSon.serialNum);
	}
}
