package First;

public class ActivitiesOrAssignment {
	
	//Final Method 
	public static void FinalSubmit() {

		 System.out.println("Q.2 Find The Largest Number");
		  //Q.2 Find The Largest Number
		  int Largest =ActivitiesOrAssignment.findLargest(1, 4, 3);
		  System.out.println("Largest Number is : " + Largest); 
		  System.out.println("Q.3 Find the Smallest Number");
		  //Q.3 Find the Smallest Number
		  int Smallest = ActivitiesOrAssignment.findSamllest(1, 4, 3);
		  System.out.println("Smallest Number is: " + Smallest); 
		  System.out.println("Q.4 Find The Largest Number And Smallest Number and Sum Both of Numbers");
		  //Q.4 Find The Largest Number And Smallest Number and Sum Both of Numbers 
		  int Sum = ActivitiesOrAssignment.sumSmallestAndLargest(1, 4, 3);
		  System.out.println("Sum of Largest and Smallest Number is: " + Sum);
		  System.out.println("Q.5 Convert Integer Number to Words ");
		  //Q.5 Convert Integer Number to Words 
		  String Words = ActivitiesOrAssignment.intChangeToCharacter(7, 5, 4);
		  System.out.println("intChangeToCharacter : " + Words);
		 
	}
	
	// All Methods 
	public static String greeting(String name)
	{
		//Greeting the user in Java World 
		return "Hello " +name + "welcome to Java";
	}
	
	public static int findLargest(int a, int b , int c )
	{
		System.out.println("numbers : ( "+a +" , " +b +" , "+ c+" )");
		int Largest=0;
		// Check Condition with respect to other two 
		//Once Condition True Return Value
		if( ((a>b) && (a>c)))
		{
			return Largest =a; 
		}else if((b>a) && (b>c)) 
		{ 
			return Largest =b; 
		}
		if((c>a) && (c>b)) 
		{
			return Largest =c;  
		}
		return Largest;
	}
	
	public static int findSamllest(int a, int b , int c )
	{
		int Samllest=0;
		System.out.println("numbers : ( "+a +" , " +b +" , "+ c+" )");
		// Check Condition with respect to other two 
		//Once Condition True Return Value
		if( ((a<b) && (a<c)))
		{
			return Samllest =a; 
		}else if((b<a) && (b<c)) 
		{ 
			return Samllest =b; 
		}
		if((c<a) && (c<b)) 
		{
			return Samllest =c;  
		}
		return Samllest;
	}
	
	public static int sumSmallestAndLargest(int a, int b , int c) {
		System.out.println("numbers : ( "+a +" , " +b +" , "+ c+" )");
		//Find Largest Digit 
		int Smallest = findSamllest(a, b, c);
		//Find Smallest Digit 
		int Largest = findLargest(a, b, c);
		//Sum Largest and Smallest Digit
		return Smallest+Largest;
	}
	
    public static String intChangeToCharacter(int integer) {
    	//Check Every Number and Find Match one or return Zero
		switch(integer) {
			case 1 :return "One";
			case 2 :return "Two"; 
			case 3 :return "Three";
			case 4 :return "Four";
			case 5 :return "Five";
			case 6 :return "Six";
			case 7 :return "Seven";
			case 8 :return "Eight";
			case 9 :return "Nine";
		default:
				return "zero";
		}
	}
    
	public static String intChangeToCharacter(int number1, int number2, int number3) {
		System.out.println("numbers : ( "+number1 +" , " +number2 +" , "+number3+" )");
		//Change each number to Word
		String First = intChangeToCharacter(number1);
		String Second = intChangeToCharacter(number2);
		String Three = intChangeToCharacter(number3);
		// Return All Digits Together  
		return  "\""+First +" " +Second+" "+Three+"\"";
	}
}