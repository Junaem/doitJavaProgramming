package hiding;

public class MyDateTest {

	public static void main(String[] args) {
		MyDate date1 = new MyDate(22, 2, 2000);
		System.out.println(date1.isValid());
		
		MyDate date2 = new MyDate(29,2,2021);
		System.out.println(date2.isValid());
		
		System.out.println();
		
		date1.getMyDate();
		date2.getMyDate();
	}

}
