package com.capgemini.lab5.q1;
import java.util.*;
public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("Enter your age: ");
			int age = sc.nextInt();
			Age a = new Age(age);
		}
		catch(AgeValidationException e)
		{
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			sc.close();
		}
		
	}

}
