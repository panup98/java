package com.anup.strings;

public class StringBuilderDemo {

	public static void main(String[] args) {
		String name = "Anup";
		name = name + "kumar";
		name = name + "Patel";
		
		
		/*
		 * ----------StringBuffer----------------
		 * concurrency environment
		 */
		
		StringBuffer sbuffer = new StringBuffer();
		sbuffer.append("IBM");
		sbuffer.append("Corporation");
		
		/*
		 * ------------StringBuilder-----------
		 * normal environment
		 */
		
		StringBuilder sb = new StringBuilder();
		sb.append("Anup");
		System.out.println(sb);
		
		sb.append("Kumar");
		System.out.println(sb);;
		
		sb.append("Patel");
		System.out.println(sb);
	}

}
