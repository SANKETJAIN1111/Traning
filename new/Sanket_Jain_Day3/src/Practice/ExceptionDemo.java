package Practice;

import java.io.FileNotFoundException;
import java.util.Scanner;
@SuppressWarnings("serial")
class UserNotFoundException extends Exception {
	UserNotFoundException() {
		super("User is invalid!");
	}
	UserNotFoundException(String error) {
		super(error);
	}
}
public class ExceptionDemo extends User{
	
		public void UserValidation()  {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter User Id");
			int userId = sc.nextInt();
			try {
				validateUser(userId);
			} 
			catch (UserNotFoundException e) {
				System.err.println(e.getMessage());
			}
			finally {
				sc.close();
			}
			System.out.println("Last line of the program!");
			
		}
	public void validateUser(int userId) throws UserNotFoundException{
		//SearchUser(userId);
		if(SearchUser(userId)) {
			//throw new UserNotFoundException("User "+userId+" is invalid");
			System.out.println("The userId entered is :"+userId);
			} else {
				throw new UserNotFoundException("User Id : "+userId+" is Not Found !! ,Please Enter a Vaild User Id.");
			//System.out.println("User "+userId+" is invalid");
			}
		}
	public boolean SearchUser(int userId) 
	{
		boolean data =false;
		User[] users = listOfUser();
		for(User u : users) 
		{
			if(u.getUserId()==userId) 
			{
			data= true;
			System.out.println(u.toString());
			break;
			}
			else 
			{
			data= false;
			}
		}
		return data;
	}

	public void SingleTryCatchFinally() {
		try {System.out.println("Try Block \n");}
		catch(Exception e ) {e.printStackTrace();
		System.out.println("Exception Block \n");
		}
		finally {
			System.out.println("Finally Block \n");}
		}
    public static User[] listOfUser() {
    	User[] user = new User[4];
    	user[0]= new User(121,"amar",15);
    	user[1]= new User(125,"sushma",35);
    	user[2]= new User(127,"akbar",25);
    	user[3]= new User(127,"deepak",65);
    	
    	return user;
    }
	
	public void NestedTryAndCatch() {
	     try {  
	    	    
	            //inner try block 1   
	            try {  
	    
	                // inner try block 2  
	                try {  
	                    int arr[] = { 1, 2, 3, 4 };  
	                    System.out.println(arr[10]);  
	                }  
	                catch (ArithmeticException e) {  
	                    System.out.println("Arithmetic exception");  
	                    System.out.println(" inner try block 2");  
	                }  
	            }  
	            catch (ArithmeticException e) {  
	                System.out.println("Arithmetic exception");  
	                System.out.println("inner try block 1");  
	            }  
	        }  
	        catch (ArrayIndexOutOfBoundsException e4) {  
	            System.out.print(e4);  
	            System.out.println(" outer (main) try block");  
	        }  
	        catch (Exception e5) {  
	            System.out.print("Exception");  
	            System.out.println(" handled in main try-block");  
	        }
	}
	  public static int divideNum(int m, int n) throws ArithmeticException {  
	        int div = m / n;  
	        return div;  
	    }  
	public void throwAndThrows() {
		  try {  
	            System.out.println(divideNum(45, 0));  
	        }  
	        catch (ArithmeticException e){  
	            System.out.println("\nNumber cannot be divided by 0");  
	        }  
	          
	        System.out.println("Rest of the code.."); 
	        
	        checkNum(-3);  
            System.out.println("Rest of the code..");  
	    }  
	
	
	public static void checkNum(int num) {  
        if (num < 1) {  
            //throw new ArithmeticException("\n Number is negative, cannot calculate square");  
        	System.out.println("\n Number is negative, cannot calculate square");
        }  
        else {  
            System.out.println("Square of " + num + " is " + (num*num));  
        }  
	}
public void MultipleCatch() {
	try {System.out.println("Try Block \n");}
	catch(ArithmeticException e ) {e.printStackTrace();
	System.out.println("ArithmeticException Block \n");
	}
	catch(NullPointerException e ) {e.printStackTrace();
	System.out.println("NullPointerException Block \n");
	}
	catch(IndexOutOfBoundsException e ) {e.printStackTrace();
	System.out.println("IndexOutOfBoundsException Block \n");
	}
	catch(Exception e ) {
		e.printStackTrace();
	System.out.println("Exception Block \n");
	}
	finally {
		System.out.println("Finally Block \n");}
	}

}



	
