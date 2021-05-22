package com.capgemini.lab5.q2;

public class Name {
	
	private String fname;
	private String lname;
	
	public Name(String fname,String lname) throws NameCheckException
	{
		if(fname == null && lname == null)
		{
			throw new NameCheckException(fname,lname);
		}
		else if(!(fname == null || lname == null) )
		{
			this.fname = fname;
			this.lname = lname;
			
			System.out.println("Name: "+fname+" "+lname);
		}
		if(fname == null)
		{
			throw new NameCheckException("Firstname");
		}
		else if(lname == null)
		{
			throw new NameCheckException("Lastname");
		}
	}
}
