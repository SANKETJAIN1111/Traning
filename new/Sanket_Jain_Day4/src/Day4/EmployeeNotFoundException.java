package Day4;

@SuppressWarnings("serial")
public class EmployeeNotFoundException extends Exception {
	
	EmployeeNotFoundException() {
		super("Employee is invalid!");
	}
	EmployeeNotFoundException(String error) {
		super(error);
	}
}
