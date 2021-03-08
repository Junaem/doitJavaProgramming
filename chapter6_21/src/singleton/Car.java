package singleton;

public class Car {
	private static int serialNum = 10000;
	private int carNum;
	
	public Car() {
		serialNum++;
		this.carNum = serialNum;
	}
	
	public int getCarNum() {
		return this.carNum;
	}
	
}
