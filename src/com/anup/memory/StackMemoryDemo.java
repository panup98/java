package com.anup.memory;

public class StackMemoryDemo {

	public static void main(String[] args) {
		 hello();
	}

	private static void hello() {
		System.out.println("StackMemoryDemo.hello()");
		hello();
	}

}
