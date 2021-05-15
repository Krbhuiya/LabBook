/*
 * The Fibonacci sequence is defined by the following rule. 
 * The first 2 values in the sequence are 1, 1. Every subsequent value is the sum of the 2 values preceding it. 
 * Write a Java program that uses both recursive and non-recursive functions to print the nth value of the Fibonacci sequence?
 */
package jeefscorejava;
import java.util.Scanner;
public class Fibonacci {
	static int n1=0,n2=1,n3; 
	public static void Recursive(int n)
	{
		if(n > 0)
		{
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" "+n3);
			Recursive(n-1);
		}	
	}
	public static void NonRecursive(int n)
	{
		int f1=0,f2=1,f3;
		System.out.println("Non-Recursive:");
		System.out.print(f2+" ");
		for(int i=0; i<n-1; i++)
		{
			f3 = f1 + f2;
			System.out.print(f3+" ");
			f1 = f2;
			f2 = f3;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter a number: ");
			int n = sc.nextInt();
			NonRecursive(n);
			break;
		case 2:
			System.out.println("Enter a number: ");
			int n1 = sc.nextInt();
			System.out.print(1);
			Recursive(n1-1);
			break;
		default :
			System.out.println("Wrong Choice.");
		}
		sc.close();
	}

}
