package singleton;//p196 ??ȥ???ڵ?

public class CarFactory {
	
	private CarFactory() {}
	private static CarFactory instance = new CarFactory();
	
	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}
	
	public Car createCar() {
		Car car = new Car();
		return car;
	}
}
