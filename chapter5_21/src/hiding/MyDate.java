package hiding;

public class MyDate {
	private int day;
	private int month;
	private int year;
	boolean isValid = true;
	
	public MyDate(int day, int month, int year) {
		setYear(year);
		setMonth(month);
		setDay(day);
	}
	
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		if(year<0) {
			this.isValid = false;
		}else
			this.year = year;
	}
	
	public void setMonth(int month) {
		if(month<1 || month>12) {
			this.isValid = false;
		}else
			this.month = month;
	}
	
	
	public void setDay(int day) {
		switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				if(day<1 || day>31) {
				this.isValid = false;
				}else
					this.day = day;
				break;
			case 2: 
				if(year%4==0) {
					if(day<1 || day>29) {
						this.isValid = false;
					}else
						this.day = day;
				}else {
					if(day<1 || day>28) {
						this.isValid = false;
					}else
						this.day = day;
				}
				break;
			case 4: case 6: case 9: case 11:
				if(day<1 || day>30) {
					this.isValid = false;
				}else
					this.day = day;
				break;
			default:
				isValid = false;
		}
	}
	public String isValid() {
		if(isValid) {
			return "¿Ø»ø¿Ø»ø";
		}else {
			return "»Ï";
		}
	}
	
	public void getMyDate() {
		if(this.isValid) {
			System.out.println(this.year+"≥‚"+this.month+"ø˘"+this.day+"¿œ");
		}else
			System.out.println("»Ï");
		
		
		
	}
}
