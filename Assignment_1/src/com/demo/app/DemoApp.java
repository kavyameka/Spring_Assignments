package com.demo.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApp {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		//Assignment -1
		JavaWorld jw = context.getBean("Framework",JavaWorld.class);
		System.out.println(jw.learningJava());
		//Assignment -2
		PythonWorld pw = context.getBean("Framework2",PythonWorld.class);
		System.out.println(pw.learningPython());
		System.out.println(pw.learningJavaMethod());
	}
}
