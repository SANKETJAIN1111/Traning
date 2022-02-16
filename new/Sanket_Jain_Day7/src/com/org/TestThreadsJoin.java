package com.org;

public class TestThreadsJoin {

	public static void main(String[] args) {
		Shared target = new Shared();
		Thread t1 = new Thread(target, "A");
		Thread t2 = new Thread(target, "B");
		Thread t3 = new Thread(target, "C");
		t1.start();
		t2.start();
		t3.start();
		 try
	        {
	            System.out.println("Current Thread: "
	                  + Thread.currentThread().getName());
	            t1.join();
	        }
	  
	        catch(Exception ex)
	        {
	            System.out.println("Exception has " +
	                                "been caught" + ex);
	        }
		
		
		 try
	        {
	            System.out.println("Current Thread: "
	                  + Thread.currentThread().getName());
	            t2.join();
	        }
	  
	        catch(Exception ex)
	        {
	            System.out.println("Exception has " +
	                                "been caught" + ex);
	        }
		 
		
		try
        {
            System.out.println("Current Thread: "
                  + Thread.currentThread().getName());
            t3.join();
        }
  
        catch(Exception ex)
        {
            System.out.println("Exception has " +
                                "been caught" + ex);
        }
		System.out.println("main thread ends");
		
	}

}
