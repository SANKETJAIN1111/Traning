package Day2;

public class Employee extends Person{
	private String empId;
	
	private int salary;
	private Person person;
	
	public Employee(String empId, int salary, Person person) {
		super();
		this.empId = empId;
		this.salary = salary;
		this.person = person;
	}
	public Employee(String empId, int salary,String name, String gender, Long mobileno) {
		super( name,  gender,  mobileno);
		this.empId = empId;
		this.salary = salary;
	
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", salary=" + salary + ", person=" + person + "]";
	}
	//Overridden  displayAllDetails
	@Override
	public void displayAllDetails() {
		System.out.println("empId : "+getEmpId()+" , name : "+person.getName()+" , Gender : " +person.getGender()+" , mobile no : " + person.getMobileno()+", salary : "+ getSalary());
		
	}

}
