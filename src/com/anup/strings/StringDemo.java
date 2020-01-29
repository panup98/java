package com.anup.strings;

public class StringDemo {

	public static void main(String[] args) {
		
		String name = "IBM";
		System.out.println(name);
		
		name = name + "Corp";
		System.out.println(name);
		
		//goes to string pool
		String myName = "Anup Patel";
		//goes to heap area
		String fullName = new String ("Anup Patel");
		
		System.out.println(myName == fullName);
		
		if (myName.equals(fullName)) {
			System.out.println("Both are equal !!");
		}
		else {
			System.out.println("Not same !!");
		}
		
	}

}
