package com.anup.functions;

public abstract class AbstractKeywordDemo {

	String getCompanyName() {
		
		return "IBM Corporation";

	}
	
	String getProject() {
		return "";
	}
	
	public static void name(String args[]) {
		Details d= new Details();
		d.getPersonalDetails();
	}
	
}

class Details{
	void getPersonalDetails() {}
}
