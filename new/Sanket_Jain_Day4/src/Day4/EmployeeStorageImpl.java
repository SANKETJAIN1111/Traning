package Day4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class EmployeeStorageImpl implements EmployeeStorage {
	ArrayList<Employee> empList = new ArrayList<Employee>();

	@Override
	public int save(Employee e) {
		if(e.getId()==0 || e==null)
		{
			return 0;
		}else {
			empList.add(e);
			return e.getId();
		}
		
	}

	@Override
	public Employee findEmployee(int id) throws EmployeeNotFoundException {
		for (Employee e : empList) {
			if (e.getId() == id)
				return e;
		}
		throw new EmployeeNotFoundException("Employee not found!!");
	}

	@Override
	public Employee[] findEmployees() {
		Employee[] eList = new Employee[empList.size()];
		if(!empList.isEmpty()) 
			eList = empList.toArray(eList);
			return eList;
		
	}

	@Override
	public void delete(int id) throws EmployeeNotFoundException {
		boolean empFound = false;
		Iterator<Employee> iterator = empList.listIterator();
		
		while (iterator.hasNext()) {
			Employee e = iterator.next();
			int eId = e.getId();
			if (eId == id) {
				iterator.remove();
				System.out.println("Entered Emplyee id: " + id+" Successfully Deleted ");
				empFound = true;
			}
		}
		if (!empFound)
			throw new EmployeeNotFoundException("Employee not found!!");
	}
	

	public static int EnterUserData(Scanner sc) {
		
		System.out.println("Choose any one option Below and Enter in digits : 1.Store\r\n" + 
				"2.	Find by id\r\n" + 
				"3.	Find all\r\n" + 
				"4.	Delete by id\r\n" + 
				"5.	Exit\r\n" 
				 );
		int option = sc.nextInt();
		return option;
		
	}
//	public static void MainMethod(Scanner sc)  throws EmployeeNotFoundException {
//		EmployeeStorageImpl eImpl= new EmployeeStorageImpl();
//		Employee1 e =new Employee1();
//		System.out.println("Please Enter Employee Id : \n");
//		e.setId(sc.nextInt());
//		System.out.println("Enter Employee Name : \n");
//		sc.nextLine();
//		String eName = sc.nextLine();
//		e.setName(eName);
//		System.out.println("Enter Salary of Employee : \n");
//		e.setSalary(sc.nextInt());
//		int result = eImpl.save(e);
//		if(result==0) {System.out.println("Employee Details Are not Stored ");}else {System.out.println("Employee Details Are Stored Succesfully : "+ result);}
//		System.out.println("Please Enter Id"); 
//		e=eImpl.findEmployee(sc.nextInt());
//		if(e==null) 
//		{throw new EmployeeNotFoundException("Employee Id : is Not Found !! ,Please Enter a Vaild User Id.");}
//		else{System.out.println(e);
//		}
//	}
//public static void switchcase(Scanner sc ,int option) throws EmployeeNotFoundException {
//	EmployeeStorageImpl eImpl= new EmployeeStorageImpl();
//	Employee1 e =new Employee1();
//	switch(option)
//	{
//	case 1: EmployeeStorageImpl.MainMethod(sc);
//	    option =EnterUserData(sc);
//	case 2: e=eImpl.findEmployee(sc.nextInt());if(e==null) {throw new EmployeeNotFoundException("Employee Id : is Not Found !! ,Please Enter a Vaild User Id.");}; break;
//	case 3: System.out.println("Employee Details :  "+ eImpl.findEmployees()); break;
//	case 4: eImpl.delete(sc.nextInt()); break;
//	
//	case 5: sc.close();break;
//	default: sc.close();System.out.println("Please Enter Any Key Exit.");
//	}	
//} 
	
}