package com.anup.misc;

public class SystemDemo {

	public static void main(String[] args) {

		System.out.println("Hello !!");
		System.err.println("Warning !!");

		System.out.println("SystemDemo.main()");

		System.out.print("Anup");
		System.out.print("Patel");
		
		String name = "Anup Patel";
		int empNo = 257;
		
		System.out.println("Employee(" + name + ")id is (" + empNo +")");
		System.out.printf("Employee (%s) id is (%d)",name, empNo);
		

	}

}
