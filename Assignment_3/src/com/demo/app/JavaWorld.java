package com.demo.app;

import org.springframework.stereotype.Component;

@Component
public class JavaWorld implements JavaLanguage{

	@Override
	public String learningJava() {
		return "I am learning Java";
		
	}

}
