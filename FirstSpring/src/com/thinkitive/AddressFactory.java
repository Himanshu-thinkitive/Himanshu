package com.thinkitive;
import com.thinkitive.*;

public class AddressFactory {
	
	public Address getInstance()
	{ 
	
		System.out.println("calling a object by an factorty method");
		Address a1=new Address();
		return a1;
		
	}

}
