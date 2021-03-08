package Chapter3;

public class p81조건연산자 {
public static void main(String[] args) {
	int fatherAge = 45;
	int motherAge = 47;
	
	char ch;
	ch = (fatherAge > motherAge) ? 't' : 'f';
	
	System.out.println(ch);
	
	
	//�ؿ��� �� �غ�
	String father = Integer.toString(fatherAge);
	
	String a = String.valueOf(motherAge);
	String b = fatherAge + "";
	
	System.out.println(a);
	System.out.println(b);
	
	
	
}
}
