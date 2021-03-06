package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		Student studentJames = new Student("James", 5000);
		Student studentThomas = new Student("Thomas", 10000);
		
		Bus bus100 = new Bus(100);
		studentJames.takeBus(bus100);
		studentJames.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen = new Subway("SubwayGreen");
		studentThomas.takeSubway(subwayGreen);
		studentThomas.showInfo();
		subwayGreen.showInfo();
	}

}
