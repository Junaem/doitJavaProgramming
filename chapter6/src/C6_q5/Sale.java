package C6_q5;

public class Sale {
	public static void main(String[] args) {
		
		Customers Kim = new Customers("±è¼ºÅÂ", 10000);
		Customers Lee = new Customers("ÀÌ¿µ¹Î", 15000);
		
		Cafe star = new Cafe("½ºÅ¸¹÷½º");
		Cafe kong = new Cafe("ÄáÅ¸¹÷½º");
		
		Kim.americano(star);
		Lee.latte(kong);
		
		star.showInfo();
		kong.showInfo();
		System.out.println();
		Kim.showInfo();
		Lee.showInfo();
		
		
	}
}
