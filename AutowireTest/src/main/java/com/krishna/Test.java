package com.krishna;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		Mobile mob=(Mobile)ctx.getBean("mobile");
		System.out.println(mob);
	}

}
