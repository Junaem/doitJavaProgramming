package staticex;

public class Student3 {//³ªÈ¥ÀÚÄÚµùp190
	private static int serialNum = 1000;
	int cardNum;
	int studentID;
	String studentName;
	
	Student3(){
		serialNum++;
		studentID = serialNum;
		cardNum = studentID+100;
	}
	
	public int getCardNum() {
		return cardNum;
	}
	
	public void setStudentName(String name) {
		this.studentName = name;
	}
}
