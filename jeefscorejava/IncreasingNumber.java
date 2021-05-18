/*
 * Exercise 7: Create a method to check if a number is an increasing number
 */
package jeefscorejava;
import java.util.Scanner;
public class IncreasingNumber {
	static boolean CheckNumber(int n)
	{
		boolean flag=true;
		int num = n%10;
		n=n/10;
		while(n > 0)
		{
			if(num < n%10)
			{
				flag = false;
				break;
			}
			num = n % 10;
			n = n / 10;
		}
		return flag;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		if(CheckNumber(n))
		{
			System.out.println(n+" is an increasing number: ");
		}
		else
		{
			System.out.println(n+" is not an increasing number: ");
		}
	}

}
