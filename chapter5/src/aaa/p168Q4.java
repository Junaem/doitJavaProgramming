package aaa;

public class p168Q4 {

	private int day;
	private int month;
	private int year;
	private boolean isValid = true;

	
			public void setday(int day) {
				this.day = day;
			}
			public void setmonth(int month) {
				this.month = month;
			}
			public void setyear(int year) {
				this.year = year;
			}
			
			public p168Q4 (int day, int month, int year) {
				this.day = day;
				this.month = month;
				this.year = year;
			}
			public String isValid() {
			
				if(month==2||(day<1||day>28)){
					return "¿À·ù´Ù Â¥»þ";
				}
					
				else {
					return "¸Â´Ù Â¥»þ";
				}
			}
			
}
