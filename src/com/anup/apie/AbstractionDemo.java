package com.anup.apie;

public class AbstractionDemo {

	public static void main(String[] args) {
		
		int processorCount=0;
		processorCount=Runtime.getRuntime().availableProcessors();
		System.out.println("Available Processors:"+processorCount);
		
		Check c=new Check();
		c.getInfo();
		c.companyName();
		c.liveIn();
	}

}
