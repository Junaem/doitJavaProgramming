package aaa;

public class p168Q4secTest {
	public static void main(String[] args) {
		p168Q4sec date1 = new p168Q4sec(22, 2, 2000);
		System.out.println(date1.isValid());
		p168Q4sec date2 = new p168Q4sec(21, 10, 1);
		System.out.println(date2.isValid());
	}
}
