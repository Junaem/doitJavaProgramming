package constructor;

public class PersonTest {
	public static void main(String[] arg) {
		Person personKim = new Person();
		personKim.name = "������";
		personKim.height = 175.3F;
		personKim.weight = 65.0F;
		
		Person personLee = new Person("�̼���", 175, 68);
		
		System.out.println(personKim.name);
		System.out.println(personKim.height);
		
		System.out.println(personLee.name);
		System.out.println(personLee.height);
		
	}
}
