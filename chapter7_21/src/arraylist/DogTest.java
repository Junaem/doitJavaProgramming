package arraylist;

public class DogTest {

	public static void main(String[] args) {
		Dog[] dogs = new Dog[5];
		
		dogs[0] = new Dog("멍멍이","말티즈");
		dogs[1] = new Dog("뽀삐","시츄");
		dogs[2] = new Dog("순심이","캐버리얼 킹찰스 스패니얼");
		dogs[3] = new Dog("제라리","페르시안고양이");
		dogs[4] = new Dog("나루토","코끼리");

		for(Dog a:dogs) {
		System.out.println(a.showDogInfo());
		}
	
		
		
	}

}
