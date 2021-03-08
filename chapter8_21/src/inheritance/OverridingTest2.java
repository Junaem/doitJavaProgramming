package inheritance;

public class OverridingTest2 {
	public static void main(String[] args) {
		Customer vc = new VIPCustomer(10030,"나몰라",2000);
		vc.bonusPoint = 1000;
		
		System.out.println(vc.getCustomerName()+"님의 지불액은 "+vc.calcPrice(10000)+"원");
		
		
	}
}
