package com.capgemini.lab5.q3;

public class Employee {
	private int salary;
	
	public Employee(int sal) throws EmployeeException
	{
		if(sal < 3000)
		{
			throw new EmployeeException();
		}
		else
		{
			salary = sal;
			System.out.println("Employe's salary is: "+salary);
		}
	}
}
