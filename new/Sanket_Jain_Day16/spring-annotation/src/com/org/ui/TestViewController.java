package com.org.ui;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.org.service.EmpServiceImpl;

public class TestViewController {
	public static void main(String[] args) {
//		ApplicationContext ap =new ClassPathXmlApplicationContext("beans.xml");
//		ClassPathXmlApplicationContext ctx = (ClassPathXmlApplicationContext)ap;
//		ctx.close();
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		// how to get the object from the container
		// <bean id = "empService" class = "com.org.service.EmployeeServiceImpl">
		EmpServiceImpl service = (EmpServiceImpl) context.getBean("empServiceImpl"); 
		service.save(); // save() -> dao.store()
		//closing the context
		ClassPathXmlApplicationContext cpx = (ClassPathXmlApplicationContext)context;
		cpx.close();
	}

}
