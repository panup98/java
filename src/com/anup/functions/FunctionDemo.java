package com.anup.functions;

import java.io.IOException;

public class FunctionDemo {

	//nonaccess_modifier access_modifier return_type functionName(parameters) {
		//function body;
	//}

	public synchronized double add (double first, int last) throws IOException {
		double sum = first + last;
		return sum;
	}
	
	//public, protected, private, package level access
	//static, final, synchronized, native, abstract
}


