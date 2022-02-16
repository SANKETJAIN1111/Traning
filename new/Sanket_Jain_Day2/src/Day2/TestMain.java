package Day2;

import javax.print.attribute.standard.Finishings;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Q.1 inharitance & Polymorphism 
		System.out.println("=======================Create Object Of person==============");
		Person first = new Person("Sanket", "Male", 7879858577L);
		//Print with To string
		String Details = first.toString();
		System.out.println(Details);
		System.out.println("=======================Create Object Of Employee==============");
		Employee firstemp = new Employee("A12345", 42000,first);
		String Detailsemp = firstemp.toString();
		//Print Info with Overridden methods
		System.out.println(Detailsemp);
		firstemp.displayAllDetails();
		first.displayAllDetails();
		
		//Q.2 Create Student and Customer Class that should be extends Person
		//Created both extends Person Class
		//Student
		System.out.println("=======================Create Object Of Student==============");
		Student std = new Student(123,"A+", first);
		std.displayAllDetails();
		//Customer
		System.out.println("=======================Create Object Of Customer==============");
		Customer cust = new Customer(59643, 33402,42000, first);
		cust.displayAllDetails();
		Person per = new Person();
		System.out.println("======================= Print person's Details ==============\n");
		per.print(first);
		System.out.println("======================= Print Employee's Details ==============\n");
		per.print(firstemp);
		System.out.println("======================= Print Student's Details ==============\n");
		per.print(std);
		System.out.println("======================= Print Customer's Details ==============\n");
		per.print(cust);
		
		//Q.3 Create Another class Main method 
		//Create 3 Students Objects 
		//Student2 st = new Student2();
		System.out.println("=======================Create Object Of Student==============");
		Student2 std1 = new Student2(101,"Amar", "Durg",60,80,70, 440, true ); 
		Student2 std2 = new Student2(102,"Akbar", "Raipur",95,60,75, 540, true ); 
		Student2 std3 = new Student2(103,"Anthony", "Bhilai",45,66,55, 800, false ); 
		//Get Total of all students 

		System.out.println("=======================Get Total Marks of students==============\n");
		int sm1 =std1.getTotalMarks();
		int sm2 =std2.getTotalMarks();
		int sm3 =std3.getTotalMarks();
		System.out.println("=======================Get Monthly least paid fee By students==============\n");
		int sf1 =std1.getFeeperMonth();
		int sf2 =std2.getFeeperMonth();
		int sf3 =std3.getFeeperMonth();
		// Check Condition with respect to other two 
		//Once Condition True Return Value
		System.out.println( "Who is Getting Highest Marks ?\n");
		String Highest =findHighestMarks(std1.getStudentName(), std2.getStudentName(), std3.getStudentName(), sm1, sm2, sm3);
		System.out.println( "Highest Marks : "+ Highest);
		System.out.println( "Who is Paid Least Fees monthly  ?\n");
		String LeastFee =findLeastFee(std1.getStudentName(), std2.getStudentName(), std3.getStudentName(), sf1, sf2, sf3);
		System.out.println( "Least Fee Paid by : "+LeastFee);
		
		System.out.println("Student's Name, total marks , Avg Marks , Result, Scholarship \n");
		System.out.println("First Student Details \n");
		System.out.println("Student Name : "+ std1.getStudentName() );
		System.out.println("Student Total Marks  : "+ std1.getTotalMarks() );
		System.out.println("Student Avg. Marks : "+ std1.getAvgMarks() );
		System.out.println("Student Result : "+ std1.getResult() );
		System.out.println("Student is Eligible For Scholarship : "+ std1.isEligibleForScholarship() );

		System.out.println("Second Student Details \n");
		
		System.out.println("Student Name : "+ std2.getStudentName() );
		System.out.println("Student Total Marks  : "+ std2.getTotalMarks() );
		System.out.println("Student Avg. Marks : "+ std3.getAvgMarks() );
		System.out.println("Student Result : "+ std2.getResult() );
		System.out.println("Student is Eligible For Scholarship : "+ std2.isEligibleForScholarship() );
		
	
		System.out.println("Third Student Details \n");
		System.out.println("Student Name : "+ std3.getStudentName() );
		System.out.println("Student Total Marks  : "+ std3.getTotalMarks() );
		System.out.println("Student Avg. Marks : "+ std3.getAvgMarks() );
		System.out.println("Student Result : "+ std3.getResult() );
		System.out.println("Student is Eligible For Scholarship : "+ std3.isEligibleForScholarship() );

	}
	public static String findLeastFee( String sa, String sb , String sc,int a, int b , int c )
	{
		System.out.println("Fee Monthly Paid : ( "+a +" , " +b +" , "+ c+" )");
		String Largest="";
		// Check Condition with respect to other two 
		//Once Condition True Return Value
		if( ((a<b) && (a<c)))
		{
			return Largest =sa; 
		}else if((b<a) && (b<c)) 
		{ 
			return Largest =sb; 
		}
		if((c<a) && (c<b)) 
		{
			return Largest =sc;  
		}
		System.out.println("Fee Paid Monthly : ( "+a +" , " +b +" , "+ c+" )");
		return Largest;
	}
	public static String findHighestMarks( String sa, String sb , String sc,int a, int b , int c )
	{
		System.out.println("numbers : ( "+a +" , " +b +" , "+ c+" )");
		String Largest="";
		// Check Condition with respect to other two 
		//Once Condition True Return Value
		if( ((a>b) && (a>c)))
		{
			return Largest =sa; 
		}else if((b>a) && (b>c)) 
		{ 
			return Largest =sb; 
		}
		if((c>a) && (c>b)) 
		{
			return Largest =sc;  
		}
		System.out.println("numbers : ( "+a +" , " +b +" , "+ c+" )");
		return Largest;
	}

}
