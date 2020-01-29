package com.anup.apie;

public class InheritanceDemo {
	public static void main(String[] args) {

		Calc cal = new Calc();
		cal.add(20, 35);
	}
}

class Calc extends StdCalculation {

}

class StdCalculation extends SciCalculation {
	void add(int firstValue, int secondValue) {
		System.out.println("std sum: " + (firstValue + secondValue));
	}
}

class SciCalculation {
	void add(int firstValue, int secondValue) {
		System.out.println("sci sum: " + (firstValue+secondValue+secondValue));
	}
}