package com.anup.functions;

public class StaticKeywordDemo {

	public static void main(String[] args) {
		// Company ibm= new Company();
		// ibm.getFounder();
		// For static methods need not to create new object

		Company.getFounder();
	}

}

class Company {
	static void getFounder() {
		System.out.println("Thomas J Watson");
	}
}