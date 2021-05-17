/*
 * Write a Java Program to find sum of numbers 
a) even index
b) odd index
 */
package handsonday2;
import java.util.Scanner;
public class SumNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int len = sc.nextInt();
		int sum_even=0,sum_odd=0;
		int arr[] = new int[len];
		System.out.println("Enter array elements: ");
		for(int i=0; i<len; i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<len; i++)
		{
			if(arr[i]%2 == 0)
			{
				sum_even = sum_even + arr[i];
			}
			else
			{
				sum_odd = sum_odd + arr[i];
			}
		}
		
		System.out.println("Sum of even elements: "+ sum_even);
		System.out.println("Sum of even elements: "+ sum_odd);
	}

}
