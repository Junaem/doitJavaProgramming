package C6_3;

public class StudentTest1 {//p183
	
	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.setStudentName("������");
		System.out.println(studentLee.serialNum);
		studentLee.serialNum++;
		
		Student studentSon = new Student();
		studentSon.setStudentName("�ռ���");
		System.out.println(studentSon.serialNum);
		System.out.println(studentLee.serialNum);
		
	}
}
