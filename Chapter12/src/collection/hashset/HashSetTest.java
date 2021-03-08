package collection.hashset;
import java.util.HashSet;
public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String>	hashSet = new HashSet<String>();
		hashSet.add(new String("이준형"));
		hashSet.add(new String("이준형2"));
		hashSet.add(new String("이준형3"));
		hashSet.add(new String("이준형4"));
		hashSet.add(new String("이준형"));
		
		System.out.println(hashSet);
	}

}
