package com.demo.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApp {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		//Assignment -3
		JavaWorld jw = context.getBean("javaWorld",JavaWorld.class);
		System.out.println(jw.learningJava());
	}
}
