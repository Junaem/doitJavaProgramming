package inheritance;

public class OverridingTest3 {
	public static void main(String args[]) {
		int price = 10000;
		
		Customer customerLee = new Customer(10010, "�̼���");
		System.out.println(customerLee.getCustomerName()+" ���� ���Ҿ��� "+customerLee.calcPrice(price)+"��");		
		VIPCustomer customerKim = new VIPCustomer(10020, "������",12345);
		System.out.println(customerKim.getCustomerName()+" ���� ���Ҿ��� "+customerKim.calcPrice(price)+"��");
		Customer vc = new VIPCustomer(10030,"������",2000);
		System.out.println(vc.getCustomerName()+" ���� ���Ҿ��� "+vc.calcPrice(price)+"��");
	}
}
