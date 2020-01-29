package com.anup.apie;

public class PolymorphismDemo {

	public static void main(String[] args) {
		
		InterestCalc ic = new CompoundInterestCalc();
		ic.calculate(100);
		

	}

}


class CompoundInterestCalc extends InterestCalc{
	@Override
	void calculate(int principal) {
		System.out.println("CompoundInterestCalc.calculate()");
	}
}


class InterestCalc{
	void calculate(int principal) {
		System.out.println("InterestCalc.calculate(integer)");
	}
	
}