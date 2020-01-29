package com.anup.misc;

public class StaticBlockDemo {

	public static void main(String[] args) {
		
		new Check();
		
		//Check c = new Check();

		//Check ctwo = new Check();

		//Check cThree = new Check();
		
		//Check cFour = new Check();

	}

}

class Check {
	
	static {
		System.out.println("Check , static block!!");
	}
	{
		System.out.println("Check, instance block");
	}
	
	public Check()
	{
		System.out.println("Check object getting created......");
	}
}