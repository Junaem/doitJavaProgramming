package object;

class Student implements Cloneable{
	int studentID;
	String studentName;
	
	public Student(int ID, String name) {
		this.studentID = ID;
		this.studentName = name;
	}
	public String toString() {
		return studentID+","+studentName;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(this.studentID==std.studentID)
				return true;
			else return false;
		}
		return false;
	}
	//@Override 추상형이나 인터페이스가 아니라서 오버라이드 필요없는듯.
	public int hashCode() {
		return studentID;
	}
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	
}

public class EqualsTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Student studentLee = new Student(100,"이준형");
		Student studentLee2 = studentLee;
		Student studentLeeS = new Student(100,"이준형");
		Student cloneA = (Student)studentLee.clone();
		
		if(studentLee==studentLee2)
			System.out.println("1과 2 주소 같음");
		else
			System.out.println("1과 2 주소 다름");
		if(studentLee.equals(studentLee2))
			System.out.println("1과 2는 동일");
		else
			System.out.println("1과 2는 다름");
		
		if(studentLee==studentLeeS)
			System.out.println("1과 S 주소 같음");
		else
			System.out.println("1과 S 주소 다름");
		if(studentLee.equals(studentLeeS))
			System.out.println("1과 S는 동일");
		else
			System.out.println("1과 S는 다름");
		
		
		System.out.println("1의 hashCode :"+studentLee.hashCode());
		System.out.println("S의 hashCode :"+studentLeeS.hashCode());
		System.out.println("클론의 hashCode :"+cloneA.hashCode());
		
		System.out.println("1의 주소값 :"+ System.identityHashCode(studentLee));
		System.out.println("s의 주소값 :"+ System.identityHashCode(studentLeeS));
		System.out.println("클론의 주소값 :"+ System.identityHashCode(cloneA));
	}
	

}
