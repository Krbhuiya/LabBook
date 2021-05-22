package com.capgemini.lab5.q2;

public class NameCheckException extends Exception{

	public NameCheckException(String name)
	{
		System.out.println("Exceotion: "+name+" is null and null value is not expected.");
	}
	public NameCheckException(String fname,String lname)
	{
		System.out.println("Exceotion: First name and Last name both are null and null value is not expected.");
	}
}
