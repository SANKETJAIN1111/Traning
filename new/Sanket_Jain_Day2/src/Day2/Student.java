package Day2;

public class Student extends Person{
	private long rollNo;
	private String grade;
	private Person person;
	public Student(long rollNo, String grade) {
		super();
		this.rollNo = rollNo;
		this.grade = grade;
	}
	public Student(long rollNo, String grade, Person person) {
		super();
		this.rollNo = rollNo;
		this.grade = grade;
		
		this.person = person;
	}
	public long getRollNo() {
		return rollNo;
	}
	public void setRollNo(long rollNo) {
		this.rollNo = rollNo;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
	@Override
	public void displayAllDetails() {
		System.out.println("rollNo : "+getRollNo()+" , name : "+person.getName()+" , Gender : " +person.getGender()+", grade : "+ getGrade());
	}

	

}
