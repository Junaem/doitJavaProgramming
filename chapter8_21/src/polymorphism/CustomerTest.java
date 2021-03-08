package polymorphism;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer();
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("�̼���");
		customerLee.bonusPoint = 1000;
		
		System.out.println(customerLee.showCustomerInfo());
		
		Customer customerKim = new VIPCustomer(10020,"������",12345);
		customerKim.bonusPoint = 1000;
		
		System.out.println(customerKim.showCustomerInfo());
		System.out.println("=====�������� ���ʽ� ����Ʈ ���=====");
		
		int price = 10000;
		//int leePrice = customerLee.calcPrice(price);
		//int kimPrice = customerKim.calcPrice(price);
		System.out.println(customerLee.showCalcInfo(price));
		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerKim.showCalcInfo(price));
		System.out.println(customerKim.showCustomerInfo());
	}

}