package com.sd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String [] args)
	{
		ApplicationContext context =new ClassPathXmlApplicationContext("bean.xml");
		Simplebean user1= (Simplebean) context.getBean("user1");
		
		//user1.check();
		//user1.destroy();
	}
}
