package C6_2;

public class Sub {
	String lineNumber;
	int passengerCount;
	int money;
	
	public Sub(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(lineNumber + "�� �°��� " + passengerCount + "���̰�, ������ " + money + "���Դϴ�.");
	}
}
