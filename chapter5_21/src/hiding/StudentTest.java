package hiding;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		//studentLee.stuName = "�̻��";
		studentLee.setStuName("�̻��");
		
		System.out.println(studentLee.getStuName());
	}

}
