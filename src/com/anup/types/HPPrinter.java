package com.anup.types;

public class HPPrinter implements Printable {

	@Override
	public boolean CanPrintPhotos() {
		System.out.println("HPPrinter.CanPrintPhotos()");
		return true;
	}

}
