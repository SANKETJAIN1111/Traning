package com.org.ui;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestViewController {
	public static void main(String[] args) {
		ApplicationContext ap =new ClassPathXmlApplicationContext("beans.xml");
		ClassPathXmlApplicationContext ctx = (ClassPathXmlApplicationContext)ap;
		ctx.close();
	}

}
