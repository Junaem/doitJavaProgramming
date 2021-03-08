package c7_Exer;
public class DogTest {
	public static void main(String[] args) {
		Dog[] dog = new Dog[5];
		for(int j=0;j<dog.length;j++) {
			dog[j] = new Dog((j+1)+"번째 개", "종류"+(j+1));
		}
		
		for(int i =0; i<dog.length; i++) {
			System.out.println(dog[i].showDogInfo());
		}
		System.out.println();
		
		for(Dog doa : dog) {
			System.out.println(doa.showDogInfo());
		}
	}
}
