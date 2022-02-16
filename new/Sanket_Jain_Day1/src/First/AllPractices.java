package First;

import java.util.Scanner;

public class AllPractices {

	public static void FinalSubmit() {
		
			System.out.println("Program is running ->");
			//Q.1 All Practices 
			System.out.println("Q.1 Cover All Practices ");
		  System.out.println("Normal Hello Program");
		 //Normal Hello Program
		  AllPractices.Helloworld(); 
		  System.out.println("All Data types Covered");
		  // All Data types Covered
		  AllPractices.Datatypes();
		  System.out.println("How to use Switch and If else Statements");
		  //How to use operators
		  AllPractices.SwitchAndIfElse();
		  System.out.println("How to use operators");
		  //How to use operators
		  AllPractices.Operators();
		  System.out.println("Different collections use Non Primitive with For loop and For Each loop");
		  //Different collections use Non Primitive with For loop and For Each loop
		  AllPractices.NonPrimitiveDatatype();
		  System.out.println("Diff b/w Dowhile  and While Loop");
		  //Diff b/w Dowhile  and While Loop
		  AllPractices.doanddowhile();
		  System.out.println(" User Input and Calculator Program with Switch");
		  //Used User Input and Calculator Program with Switch
		  AllPractices.UserInput();
		  
	}
	public static void Helloworld()
	{
		//This method is print not return any data.
		//Print any thing using print method
		System.out.println("Welcome 'Name' , Hello World");
	}
	
	public static void Datatypes()
	{
	//Datatype are define different type of data like string , int , long, double, char, boolean
	//every data type have there range 
		byte byteType =127;//-128- +127 (0111 1111)
		char charType = 'A';
		char charIntType = 89;
		String stringType = "ABCxyz";
		int intType = 12345;
		int intcharType = 'b';
		long longType = 139718371L; // 4 byte with 'L' 8 byte
		float floatType = 2334.3f; // float need to write f in last 
		System.out.println("<!---------Datatypes-------------!> ");
		Value(byteType);
		Value(charType);
		Value(charIntType);
		Value(stringType);
		Value(intType );
		Value(intcharType);
		Value(longType);
		Value(floatType);
		//System.out.println("byteType :");
	}
	
	
	public static void UserInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Java World , Please Enter your Name : ");
		
		String Name = scan.nextLine();
		System.out.println("Hello " + Name +" Thanks For the Information");
		scan.nextLine();
		System.out.println("Please choose your options below : ");
		System.out.println("1. Add two Numbers.");
		System.out.println("2. Subtract two Numbers.");
		System.out.println("3. Multiple two Numbers.");
		System.out.println("4. Divide two Numbers.");
		System.out.println("5. Exit.");
		int options = scan.nextInt();
		System.out.println("Please Enter two Numbers");
		System.out.println("First Number :");
		double first = scan.nextDouble();
		System.out.println("Second Number :");
		double second = scan.nextInt();
		switch(options) {
		case 1: System.out.println(first + second);break;
		case 2: System.out.println(first - second);break;
		case 3: System.out.println(first * second);break;
		case 4: System.out.println(first / second);break;
		default:
			scan.close();
		}
		scan.close();
	}
	
	public static void doanddowhile() {
		int count= 1;
		while(count<5)
		{
			System.out.println("While loop Counter : " + count);
			count++;
		}
		do {
			System.out.println("Do While loop Counter : " + count);
			count--;
		}
		while(count>=0);
	}
	public static void NonPrimitiveDatatype()
	{
		//Array Of strings and Objects
	String[] Car = {"TATA", "Maruti Suzuki","BMW","Volvo"};
	Object[] Info = {"Details","Qty: ", 2 ,"Color: White"};
	// for or foreach
	for(int i = 0; i<Car.length-1;++i)
	{
		System.out.println(Car[i]);
		System.out.println(Info[0]+"-> "+ Info[1] +" : "+ Info[2]+"\n"+Info[3]);
	}
	for(String str : Car)
	{
		System.out.println(str);
	}
	
		
	}
	public static void SwitchAndIfElse()
	{
		int Marks =59; 
		if(Marks >= 70)
		{
			System.out.println("Excellent");
		} else if ((Marks<=70)&&(Marks>=60)) {
			System.out.println("First Class");
		}
		else if((Marks<=60)&&(Marks>=50)) {
			System.out.println("Second Class");
		}
		else if((Marks<=50)&&(Marks>=40)) {
			System.out.println("Third Class");
		}else {
			System.out.println("Failed");
		}
		
		char charGrade = 'A';
		switch(charGrade){
			case 'A': System.out.println("Excellent"); break;
			case 'B': System.out.println("Average"); break;
			case 'C': System.out.println("Good"); break;
			case 'D': System.out.println("Just Pass"); break;
			default :
			System.out.println("Excellent"); break;
		}
	}
	
	public static void Operators()
	{
	// +, -, *, /, %, ++, --, =, ==, <, >, <=, >=, !=, &&, || 
	//Pre order & Post Order
		int x= 20;
		int y= x++; //post;
		int a = 30;
		int b= ++a;//pre a = 30-> 31 a, b =31
		System.out.println("x = " + x +"y = " + y+"a = " + a+"b = " + b);
		boolean status = a>x;
		System.out.println("a> x status" + status);
		status = (a==x);
		System.out.println("a==x status" + status);
		status = (a!=x);
		System.out.println(" a!=x status" + status);
		status = (a<x);
		System.out.println("a < x status" + status);
	}
	
	//Common method 
	public static void Value(Object data)
	{
		System.out.println(" "+ data.getClass()+" : "+ data);
	}
}
