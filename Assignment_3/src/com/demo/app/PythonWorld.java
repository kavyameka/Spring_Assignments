package com.demo.app;

public class PythonWorld implements PythonLanguage{
	private JavaWorld javaworld;
	public PythonWorld(JavaWorld javaworld) {
		super();
		this.javaworld = javaworld;
	}

	@Override
	public String learningPython() {
		return "I am learning python";
		
	}
	
	
	public String learningJavaMethod() {
		String str = this.javaworld.learningJava();
		return str;
		
	}

}
