package C6_q5;

public class Sale {
	public static void main(String[] args) {
		
		Customers Kim = new Customers("�輺��", 10000);
		Customers Lee = new Customers("�̿���", 15000);
		
		Cafe star = new Cafe("��Ÿ����");
		Cafe kong = new Cafe("��Ÿ����");
		
		Kim.americano(star);
		Lee.latte(kong);
		
		star.showInfo();
		kong.showInfo();
		System.out.println();
		Kim.showInfo();
		Lee.showInfo();
		
		
	}
}
