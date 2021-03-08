package C6_q5;

public class Customers {
	String name;
	int money;
	
	public Customers(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void americano(Cafe cafe) {
		this.money -= 4000;
		cafe.drink(4000);
	}
	public void latte(Cafe cafe) {
		this.money -= 4500;
		cafe.drink(4500);
	}
	
	public void showInfo() {
		System.out.println(name + "ÀÇ ÀÜ¾×Àº " + money);
	}
	
	
	
}