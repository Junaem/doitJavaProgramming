package inheritance;

public class OverridingTest1 {

	public static void main(String[] args) {
		Customer customerLee = new Customer(10010,"�̼���");
		customerLee.bonusPoint = 1000;
		
		VIPCustomer customerKim = new VIPCustomer(10020,"������",1234);
		customerKim.bonusPoint = 10000;
		
		int price = 10000;
		System.out.println(customerLee.getCustomerName()+" ���� ������ �ݾ��� "+ customerLee.calcPrice(price)+"��");
		System.out.println(customerKim.getCustomerName()+" ���� ������ �ݾ��� "+ customerKim.calcPrice(price)+"��");
	}

}
