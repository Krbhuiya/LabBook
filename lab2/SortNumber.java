/*
 * Exercise 3: 
 * Create a method which accepts an integer array, reverse the numbers 
 * in the array and returns the resulting array in sorted order
 * 
 */
package lab2;
import java.util.*;
public class SortNumber {
	public static int[] getSorted(int arr[])
	{
		int len = arr.length;
		for(int i=0; i<len/2; i++)
		{
			int temp = arr[i];
			arr[i] = arr[len-i-1];
			arr[len-i-1] = temp;
		}

		for(int i=0;i<len;i++)
		{
			for(int j=1;j<len-i;j++)
			{
				if(arr[j-1] > arr[j])
				{
					int t = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = t;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array length: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int arr_1[] = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		arr_1 = getSorted(arr);
		for(int i=0; i<n; i++)
		{
			System.out.println(arr_1[i]);
		}
		sc.close();
	}

}
