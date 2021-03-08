package classpart;//p137

public class FunctionTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int sum = minus(num1, num2);
		System.out.println(num1+"-"+num2+"="+sum+"ÀÔ´Ï´Ù.");
	}

	public static int add(int na1, int na2) {
		int result = na1 + na2;
		
		return result;
	}
	
	public static int minus(int na1, int na2) {
		int result = na1 - na2;
		
		return result;
	}
}
