package Chapter4;

public class p123Q1 {
	public static void main(String[] args) {
	
		int num1 = 10;
		int num2 = 2;
		char oper = '*';
		int fuck = 0;
		int fuck2 = 0;
		
		if (oper == '+') {
			fuck = num1 + num2;
		}
			else if (oper =='-') {
				fuck = num1 - num2;
			}
			else if (oper == '*') {
				fuck = num1 * num2;
			}
			else if (oper == '/')
				fuck = num1 / num2;
			else;
		System.out.println(fuck);
		System.out.println();
		
		switch(oper) {
		case '+' : fuck2 = num1 + num2;
			break;
		case '-' : fuck2 = num1 - num2;
			break;
		case '*' : fuck2 = num1 * num2;
			break;
		case '/' : fuck2 = num1 / num2;
		}
		System.out.println(fuck2);
	}
}
