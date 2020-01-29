package com.anup.variables;

public class variablesDemo {
	
	
	//variables have access modifiers public, private, protected
	int level;

	public static void main(String[] args) {

		// local variable
		// local variables should be initialized before using
		int count = 10;
		System.out.println("Coun tvalue :" + count);

		// System.out.println("Level Values: " +level);
	}

	void calculate() {
		//instance variable
		System.out.println("Level val: " + level);
	}
}
