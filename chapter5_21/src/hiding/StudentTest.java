package hiding;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		//studentLee.stuName = "이상원";
		studentLee.setStuName("이상원");
		
		System.out.println(studentLee.getStuName());
	}

}
