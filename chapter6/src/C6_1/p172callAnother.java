package C6_1;

class Person{
	String name;
	int age;

	Person(){
		this("이름 없음", 1);
	}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
		
	}
	Person returnItSelf() {
		return this;
	}
}

public class p172callAnother {
	public static void main(String[] args) {
		Person Noname = new Person();
		System.out.println(Noname.name);
		System.out.println(Noname.age);
		
		Person p = Noname.returnItSelf();
		System.out.println(p);
		System.out.println(Noname);
		
	}

}
