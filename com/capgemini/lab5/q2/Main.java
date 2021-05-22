package com.capgemini.lab5.q2;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try
		{
//			System.out.println("Enter First name: ");
//			String fname = sc.next();
//			System.out.println("Enter Last name: ");
//			String lname = sc.next();
			String fname = "Bikramjit";
			String lname = null;
			Name a = new Name(fname,lname);
		}
		catch(NameCheckException e)
		{
			
		}
		finally
		{
			//sc.close();
		}
	}

}
