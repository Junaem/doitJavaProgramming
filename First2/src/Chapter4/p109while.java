package Chapter4;

public class p109while {
	public static void main(String[] args) {
		
		int sum = 0;
		int num = 1;
		
		while (num <= 10) {
			sum = num + sum;
			++num;
			
		}
		
		System.out.println("1���� " + (num - 1) + "������ ���� " + sum + "�Դϴ�.");
	}
}
