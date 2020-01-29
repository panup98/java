package com.anup.apie;

public class Check {

	int count;
	String name;

	void getInfo() {
		personalInfo();
		System.out.println("anup P");
	}

	public void liveIn() {
		System.out.println("Banglore,India");
	}

	protected String companyName() {
		return "IBM Coproration";
	}

	private void personalInfo() {
		System.out.println("Anup Patel, Banglore, India");
	}
}
