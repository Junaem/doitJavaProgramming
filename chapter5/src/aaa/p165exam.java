package aaa;

public class p165exam {
	int day;
	int month;
	int year;
	
	public void setDay(int day) {
		
		
			if(month == 2|| (day < 1 || day>28)) {
				System.out.println("����");
			}
			else {
					this.day = day;
				}
			
	}
	
}
