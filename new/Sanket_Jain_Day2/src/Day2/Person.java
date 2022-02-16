package Day2;

public class Person {
	//created displayAllDetails
	private String name ;
	
	private String gender;
	private long mobileno; 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Long getMobileno() {
		return mobileno;
	}
	public void setMobileno(Long mobileno) {
		this.mobileno = mobileno;
	}
	public Person() {
		super();
		
	}
	public Person(String name, String gender, Long mobileno) {
		super();
		this.name = name;
		this.gender = gender;
		this.mobileno = mobileno;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", mobileno=" + mobileno + "]";
	}
	public void displayAllDetails() {
		System.out.println("name : "+getName()+" , Gender : " +getGender()+" , mobile no : " + getMobileno());
		
	}
	public static void print(Person p)
	{
	p.displayAllDetails();
	}
	
}
