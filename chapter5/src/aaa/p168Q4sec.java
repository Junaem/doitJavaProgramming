package aaa;

public class p168Q4sec {

	private int day;
	private int month;
	private int year;
	private boolean isValid = true;

	public p168Q4sec(int day, int month, int year) {
		
		setYear(year);
		setMonth(month);
		setDay(day);
	}
	
	public void setYear(int year) {
		if(year<0) {
			isValid = false;
		}
		else {
			this.year = year;
		}
	}
	
	public void setMonth(int month) {
		if(month<0||month>13) {
			isValid = false;
		}
		else {
			this.month = month;
		}
	}
	
	public void setDay(int day) {
		switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12 :
				if(day>31||day<1){
					isValid = false;
				}
				else {
					this.day = day;
				}
				
				
			case 4: case 6: case 9: case 11: 
				if(day>30||day<1) {
					isValid = false;
				}
				else {
					this.day = day;
				}
				
			case 2:
				if(day<1||day>28) {
					isValid = false;
				}
				else {
					this.day = day;
				}
		}
	}
	
	public String isValid() {
		
		if (isValid) {
			return "잘했다";
		}
		else {
			return "오류다";
		}
	}
	
	public int getday() {
		return day;
	}
	public int getmonth() {
		return month;
	}
	public int getyear() {
		return year;
	}
	
	
	
	
}
