package staticex;

public class StudentTest1 {
	public static void main(String[] args) {
		Student1 studentLee = new Student1();
		studentLee.setStudentName("������");
		System.out.println(studentLee.serialNum);
		studentLee.serialNum++;
		
		Student1 studentSon = new Student1();
		studentSon.setStudentName("�ռ���");
		System.out.println(studentSon.serialNum);
		System.out.println(studentLee.serialNum);
	}
}