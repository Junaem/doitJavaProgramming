package C6_2;

public class Taxi {
	String Taxiname;
	int money;
	int passengerCount;
	
	public Taxi(String Taxiname) {
		this.Taxiname = Taxiname;
	}
	
	public void take(int money) {
		this.money+=money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(Taxiname + "�� �°��� " + passengerCount + "���̰�, ������ " + money + "�� �Դϴ�.");
	}
	
	
	
	
	
	
}
