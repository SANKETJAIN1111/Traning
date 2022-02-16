package Day2;

public class Customer extends Person{
   private int customerId;
   private int accountNumber;
   private int balance;
   private Person person;
   
   
   
public Customer(int customerId, int accountNumber, int balance, Person person) {
	super();
	this.customerId = customerId;
	this.accountNumber = accountNumber;
	this.balance = balance;
	this.person = person;
}
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}
public Customer(String name, String gender, Long mobileno) {
	super(name, gender, mobileno);
	// TODO Auto-generated constructor stub
}
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public int getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(int accountNumber) {
	this.accountNumber = accountNumber;
}
public int getBalance() {
	return balance;
}
public void setBalance(int balance) {
	this.balance = balance;
}
public Person getPerson() {
	return person;
}
public void setPerson(Person person) {
	this.person = person;
}
	@Override
	public void displayAllDetails() {
		System.out.println("customerId : "+getCustomerId()+" , name : " +person.getName()+" , gender : "+person.getGender()+" , AccountNumber : " + getAccountNumber()+" , Balance : "+getBalance());
	}
}
