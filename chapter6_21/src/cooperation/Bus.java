package cooperation;

import thisEx.ThisExample;

public class Bus {
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		this.money +=money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(busNumber+"번의 승객은 "+passengerCount+"명이고, 수입은 "+money+"입니다.");
	}
}
