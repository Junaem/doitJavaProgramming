package Chapter4;

public class p111dowhile {
	public static void main(String[] args) {
		
		int num = 1;
		int sum = 0;
		
		do {
			sum = num + sum;
			++num;	//�̰Ÿ� ���� �ѹ� �ϰ� �ڿ� ���ǹ� �ݺ���
		}
		while (num <= 10);
		
		System.out.println("1���� " + (num - 1) + "������ ���� " + sum + "�Դϴ�.");
	}
}
