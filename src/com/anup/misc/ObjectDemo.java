package com.anup.misc;

public class ObjectDemo {

	public static void main(String[] args) {
		
		Mobile m = new Mobile();
		m.getType();
		m.screenSize();
		m.toString();
		
		Object mob= new Mobile();
		Keyboard moKey = new Mobile();
	}

}


class Mobile extends Keyboard{
	void screenSize() {
		
	}
}

class Keyboard{
	void getType() {
		
	}
}