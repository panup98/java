package com.anup.types;

public class CanonPrinter implements Printable{

	@Override
	public boolean CanPrintPhotos() {
		System.out.println("CanonPrinter.CanPrintPhotos()");
		return false;
	}
	
}
