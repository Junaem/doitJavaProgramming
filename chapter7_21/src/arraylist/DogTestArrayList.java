package arraylist;
import java.util.ArrayList;
public class DogTestArrayList {

	public static void main(String[] args) {
		ArrayList<Dog> dogs =new ArrayList<Dog>();
		
		dogs.add(new Dog("?۸???", "Ǫ??"));
		dogs.add(new Dog("??????","??ī???дϾ?"));
		dogs.add(new Dog("????", "????"));
		dogs.add(new Dog("??Ű","?ùٰ?"));
		dogs.add(new Dog("??ī","?????ݸ?"));
		
		for(Dog d:dogs) {
			System.out.println(d.showDogInfo());
		}

	}

}
