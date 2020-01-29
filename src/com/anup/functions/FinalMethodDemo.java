package com.anup.functions;

public class FinalMethodDemo {

	static final int value = 100;
			
	public static void main(String[] args) {
		System.out.println(value);
		value=200;
		System.out.println("Updated Value: " +value);
	}

}


class Data{
	void stdData() {
		System.out.println("Data.stdData()");
	}
	
	final void splData() {
		System.out.println("Data.splData()");
	}
}

class CompanyData extends Data{
	
}