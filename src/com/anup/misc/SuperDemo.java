package com.anup.misc;

public class SuperDemo {

	public static void main(String[] args) {
		ServiceComapny sc = new ServiceComapny();
		sc.Info();

	}

}

class Company {

	public Company(int value) {
		super();
		System.out.println("Company Constructor: "+ value);
	}

	void Info() {
		System.out.println("Company.Info()");
	}

}

class ServiceComapny extends Company {

	public ServiceComapny() {
		super(234);
		// TODO Auto-generated constructor stub
	}

}