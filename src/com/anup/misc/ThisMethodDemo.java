package com.anup.misc;

public class ThisMethodDemo {

	public static void main(String[] args) {
		Computer dell= new Computer("Dell", "Vostro", (byte)16);
		System.out.println(dell);
	}

}

class Computer {
	String manufacturer;
	String model;
	byte ram;

	public Computer() {
	}

	public Computer(String manufacturer, String model) {
		this.manufacturer = manufacturer;
		this.model = model;
	}

	public Computer(String manufacturer, String model, byte ram) {
		this(manufacturer,model);
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "Computer [manufacturer=" + manufacturer + ", model=" + model + ", ram=" + ram + "]";
	}

	
	

}