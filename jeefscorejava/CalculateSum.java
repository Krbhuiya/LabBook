/*
 * Exercise 5: 
 * Create a class with a method which can calculate the sum of first n natural numbers which are divisible by 3 or 5.
 */
package jeefscorejava;
import java.util.Scanner;
public class CalculateSum {

	static int Calculatesum(int n)
	{
		int sum = 0;
		for(int i=0; i<n; i++)
		{
			if(i%3 == 0 || i%5 == 0)
			{
				sum = sum + i;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int sum = Calculatesum(n);
		System.out.println("Sum of first "+ n +" natural numbers: "+sum);
		sc.close();
	}
}
