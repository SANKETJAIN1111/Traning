package Day4;

import Day4.Employee;
import Day4.EmployeeStorageImpl;

public class EmployeeInstance {
	public Employee getEmployeeIntsance() {
		return new Employee();
	}
	
	public EmployeeStorageImpl getEmployeeStorageInstance() {
		return new EmployeeStorageImpl();
	}

}
