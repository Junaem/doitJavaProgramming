package C6_2;

public class TakeTrans {
	public static void main(String[] args) {
		Student SJames = new Student("James", 5000);
		Student STomas = new Student("Tomas", 20000);
		
		Bus bus100 = new Bus(100);
		SJames.takeBus(bus100);
		SJames.showInfo();
		bus100.showInfo();
		
		Sub subLine2 = new Sub("line2");
		STomas.takeSub(subLine2);
		STomas.showInfo();
		subLine2.showInfo();
		
		Taxi taxi1 = new Taxi("??????");
		STomas.takeTaxi(taxi1);
		STomas.showInfo();
		taxi1.showInfo();
		
		
	}
}
