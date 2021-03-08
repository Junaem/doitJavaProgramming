package template;

public class CarTest {

	public static void main(String[] args) {
		System.out.println("====자율 주행 내 차====");
		Car myCar = new AICar();
		myCar.run();

		System.out.println("====수동 주행 니 차====");
		Car hisCar = new ManualCar();
		hisCar.run();

	}

}
