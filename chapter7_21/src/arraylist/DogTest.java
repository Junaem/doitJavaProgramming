package arraylist;

public class DogTest {

	public static void main(String[] args) {
		Dog[] dogs = new Dog[5];
		
		dogs[0] = new Dog("�۸���","��Ƽ��");
		dogs[1] = new Dog("�ǻ�","����");
		dogs[2] = new Dog("������","ĳ������ ŷ���� ���дϾ�");
		dogs[3] = new Dog("����","�丣�þȰ����");
		dogs[4] = new Dog("������","�ڳ���");

		for(Dog a:dogs) {
		System.out.println(a.showDogInfo());
		}
	
		
		
	}

}
