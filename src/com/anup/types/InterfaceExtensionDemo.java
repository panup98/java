package com.anup.types;

public class InterfaceExtensionDemo {

	public static void main(String[] args) {

	}

}

class validate implements HardwareValidation, SoftwareValidation{

	@Override
	public boolean validate() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validate(int count) {
		// TODO Auto-generated method stub
		return false;
	}

	
	}
	


interface HardwareValidation{
	boolean validate(int count);
}

interface SoftwareValidation{
	boolean validate();
}