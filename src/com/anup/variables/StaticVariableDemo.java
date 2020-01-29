package com.anup.variables;

public class StaticVariableDemo {

	public static void main(String[] args) {
		
		Vendor iiht =new Vendor();
		iiht.createVendor("IIHT Technologies");
		iiht.totalVendors();
		
		Vendor hungerBox= new Vendor();
		hungerBox.createVendor("HungerBox Food Services");
		hungerBox.totalVendors();
		
		Vendor srs=new Vendor();
		srs.createVendor("SRS transportation");
		srs.totalVendors();
		
		Vendor bisleri = new Vendor();
		bisleri.totalVendors();

	}

}

class Vendor {
	static int totalVendors;

	void createVendor(String name) {
		System.out.println("Creating a vendor: " +name);
		totalVendors++;
	}

	void totalVendors() {
		System.out.println("No of Vendors: " + totalVendors);
	}

}
