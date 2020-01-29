package com.anup.types;

public class IDemo {

	public static void main(String[] args) {

		HPPrinter hp = new HPPrinter();
		System.out.println(hp.CanPrintPhotos());

		CanonPrinter canon = new CanonPrinter();
		System.out.println(canon.CanPrintPhotos());
		
		
		Printable p=new CanonPrinter();
		p=new HPPrinter();
		
		
		Printable another = new Printable() {
			
			@Override
			public boolean CanPrintPhotos() {
				System.out.println("IDemo.main(...).new Printable() {...}.CanPrintPhotos()");
				return false;
			}
		};
		System.out.println(another.CanPrintPhotos());
		
	}

}
