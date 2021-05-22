package com.capgemini.lab5.q3;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("Enter salary: ");
			int sal = sc.nextInt();
			Employee e = new Employee(sal);
		}
		catch(EmployeeException es)
		{
		}
		finally 
		{
			sc.close();
		}
	}

}
