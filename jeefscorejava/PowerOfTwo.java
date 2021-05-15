/*
 * Create a method to check if a number is a power of two or not.
 */
package jeefscorejava;
import java.util.Scanner;
public class PowerOfTwo {

	public static boolean CheckNumber(int n) 
	{
		if(n == 0)
		{
			return false;
		}
		while(n != 1)
		{
			if(n%2 != 0)
			{
				return false;
			}
			n = n / 2;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		if(CheckNumber(n))
		{
			System.out.println(n+" is a power of two");
		}
		else
		{
			System.out.println(n+" is not a power of two");
		}
		sc.close();
	}
}
