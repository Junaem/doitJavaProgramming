package classpart;

public class Order {
	long odNo;
	String odID;
	String odDate;
	String odName;
	String productNo;
	String adress;
	
	public static void main(String[] arg) {
		Order orderA = new Order();
		orderA.odNo = 201803120001l;
		orderA.odID = "abc123";
		orderA.odDate = "2018³â 3¿ù 12ÀÏ";
		
		System.out.println(orderA.odNo);
		System.out.println(orderA.odID);
		System.out.println(orderA.odDate);
	}
}
