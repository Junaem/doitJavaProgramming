package Chapter4;

public class p97ifelse {
	public static void main(String[] args) {
		
		int age;
		int charge;
		
		age = 17;
		
		if (age < 8) {
			charge = 1000;
			System.out.println("������ �Ƶ��Դϴ�.");
		}
		
			else if (age < 14) {
				charge = 2000;
				System.out.println("�ʵ��л��Դϴ�.");
			}
			else if (age < 20) {
				charge = 2500;
				System.out.println("��,�����л��Դϴ�.");
			}
			else {
				charge = 3000;
				System.out.println("�����Դϴ�.");
			}
		
		System.out.println("������ " + charge + "�� �Դϴ�.");
		
	}
}