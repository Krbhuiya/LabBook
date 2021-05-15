/*
 * Exercise 1: 
 * Create a method which accepts an array of integer elements and return the second smallest element in the array
 */
package lab2;
import java.util.Scanner;
public class SecondSmallest {
	public static int getSecondSmallest(int[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int j=1; j<arr.length-i; j++)
			{
				if(arr[j-1] > arr[j])
				{
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr[1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of array: ");
		int len = sc.nextInt();
		int arr[] = new int[len];
		System.out.println("Enter the array values: ");
		for(int i=0; i<len; i++)
		{
			arr[i] = sc.nextInt();
		}
		int val = getSecondSmallest(arr);
		System.out.println("Second smallest element in the array: "+val);
		sc.close();
	}

}
