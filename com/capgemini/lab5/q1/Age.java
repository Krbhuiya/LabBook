package com.capgemini.lab5.q1;

public class Age {

	private int age;
	public Age(int age) throws AgeValidationException
	{
		if(age > 15)
		{
			this.age = age;
			System.out.println("Age is: "+ this.age);
		}
		else
		{
			throw new AgeValidationException();
		}
	}
	
	public void setAge(int age) throws AgeValidationException
	{
		if(age > 15)
		{
			this.age = age;
			System.out.println("Age is: "+ this.age);
		}
		else
		{
			throw new AgeValidationException();
		}
	}
	
	public int age()
	{
		return this.age;
	}
}

