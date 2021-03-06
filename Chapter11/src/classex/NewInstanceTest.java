package classex;
import java.util.ArrayList;
public class NewInstanceTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		Person person1 = new Person();
		System.out.println(person1);
		
		Class pClass = Class.forName("classex.Person");
		Person person2 = (Person)pClass.newInstance();
		System.out.println(person2);
		
		Class pClass2 = person1.getClass();
		Person person3 = (Person)pClass2.newInstance();
		System.out.println(person3);
	}

}
