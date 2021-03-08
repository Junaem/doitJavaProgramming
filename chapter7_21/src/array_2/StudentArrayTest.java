package array_2;
import java.util.ArrayList;
public class StudentArrayTest {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		
		students.add(new Student("James"));
		students.add(new Student("Tomas"));
		students.add(new Student("Edward"));

		Student b = new Student("Carl");
		students.add(b);

		for(Student a:students) {
			a.showStudentInfo();
		}
		
	}

}
