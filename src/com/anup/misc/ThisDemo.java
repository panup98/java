package com.anup.misc;

public class ThisDemo {

	int count;

	public static void main(String[] args) {
		ThisDemo td = new ThisDemo();
		td.process();

	}

	void process() {
		System.out.println("Count Value:" + count);
		setCount(148);
		System.out.println("Updated Count:" + count);
	}

	private void setCount(int count) {

		this.count = count;
	}

}
