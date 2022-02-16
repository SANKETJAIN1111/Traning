package Day2;

public class Student2 {
	private int studentid;
	private String studentName;
	private String cityName;
	private int mark1;
	private int mark2;
	private int mark3;
	private int feeperMonth;
	private boolean isEligibleForScholarship;
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public int getMark1() {
		return mark1;
	}
	public void setMark1(int mark1) {
		this.mark1 = mark1;
	}
	public int getMark2() {
		return mark2;
	}
	public void setMark3(int mark3) {
		this.mark3 = mark3;
	}
	public int getMark3() {
		return mark3;
	}
	public int getTotalMarks() {
		return mark1 + mark2 +mark3;
	}
	public int getAvgMarks() {
		return (mark1 + mark2 +mark3)/3;
	}
	
	public void setMark2(int mark2) {
		this.mark2 = mark2;
	}
	public int getFeeperMonth() {
		return feeperMonth;
	}
	public int getAnnualFee() {
		return feeperMonth*12;
	}
	public void setFeeperMonth(int feeperMonth) {
		this.feeperMonth = feeperMonth;
	}
	public boolean isEligibleForScholarship() {
		return isEligibleForScholarship;
	}
	public String  getResult() {
		if((mark1>=60)&&(mark2>=60)&&(mark3>=60))
		{
			return "Pass";
		}
		return "Fail";
	}
	public void setEligibleForScholarship(boolean isEligibleForScholarship) {
		this.isEligibleForScholarship = isEligibleForScholarship;
	}

	public Student2() {
		super();
		
	}
 
	public Student2(int studentid, String studentName, String cityName, int mark1, int mark2, int mark3, int feeperMonth, boolean isEligibleForScholarship ) {
		super();
		this.studentid = studentid;
		this.studentName = studentName;
		this.cityName = cityName;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
		this.feeperMonth = feeperMonth;
		this.isEligibleForScholarship = isEligibleForScholarship;
		
	}

	
	
}
