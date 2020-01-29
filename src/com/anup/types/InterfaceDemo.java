package com.anup.types;

public interface InterfaceDemo {
	
	int value = 100;
	int add(int first,int second);
}



interface Info{}
interface Join extends Info{}

class Auto{}
class Bus extends Auto{}

class check implements Info, Join, Serialiazable{
	
}

abstract class Claculations implements InterfaceDemo{
	
	
}

