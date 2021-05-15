/*
 * Exercise 6: 
 * Create a class with a method to find the difference between the sum of the squares and the square of the sum of the first n natural numbers.
 */
package jeefscorejava;
import java.util.*;
public class Calculatedifference {
	static int CalculateDifference(int n)
	{
		int Sum=0;
		int x=0,y=0;
		for(int i=0; i<n; i++)
		{
			x = x + i*i;
			y = y + i;
		}
		y = y*y;
		Sum = x - y;
		return Sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int diff = CalculateDifference(n);
		System.out.println("The difference between the sum of the squares and the square of the sum of the first n natural numbers: "+diff);
		sc.close();
	}

}
