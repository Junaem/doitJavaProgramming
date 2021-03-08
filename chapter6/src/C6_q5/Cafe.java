package C6_q5;

public class Cafe {
	 int money = 0;
	 int customers = 0;
	 String name;
	 
	 public Cafe(String name) {
		 this.name = name;
	 }
	 
	 public void drink(int money) {
		 this.money += money;
		 customers++;
	 }
	 
	 public void showInfo() {
		 System.out.println(name + "의 수익은 " + money + "원이고, 손님은  총 " + customers + "명이다.");
	 }
 
 
 
}
