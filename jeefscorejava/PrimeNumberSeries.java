/*
 * Write a Java program that prompts the user for an integer and then prints out all the prime numbers up to that Integer?
 */
package jeefscorejava;
import java.util.*;
public class PrimeNumberSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range of number: ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++)
		{
			int count = 0;
			for(int j=i; j>=1; j--)
			{
				if(i%j == 0)
				{
					count++;
				}
			}
			if(count == 2)
			{
				System.out.print(i+" ");
			}
		}
		sc.close();
	}
}
