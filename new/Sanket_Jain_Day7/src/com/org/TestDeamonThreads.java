package com.org;

public class TestDeamonThreads {

	public static void main(String[] args) {
		WithoutSync target = new WithoutSync();
		Thread t1 = new Thread(target, "A");
		Thread t2 = new Thread(target, "B");
		Thread t3 = new Thread(target, "C");
		t1.setDaemon(true);
		t2.setDaemon(true);
		t3.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
		//t1.join();
		System.out.println("main thread ends");
	}

}
