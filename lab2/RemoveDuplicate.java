/*
 * Exercise 4: 
 * Create a method which accepts an integer array and removes all the duplicates in the array. 
 * Return the resulting array in descending order
 */
package lab2;
import java.util.*;
public class RemoveDuplicate {
	public static int[] modifyArray(int arr[])
	{
		int n = arr.length;
		int arr_1[] = new int[n];
		int k = 0;
		for(int i=0; i<n; i++)
		{
			for(int j=1; j<n-i; j++)
			{
				if(arr[j-1] < arr[j])
				{
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	
		for(int i=0; i<n-1; i++)
		{
			if(arr[i] != arr[i+1])
			{
				arr_1[k++] = arr[i];
			}
		}
		arr_1[k++] = arr[n-1];
	
		return arr_1;
	
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
		arr_1 = modifyArray(arr);
		int k = arr_1.length;
		for(int i=0; i<k; i++)
		{
			arr[i] = arr_1[i];
		}
		for(int i=0; i<n; i++)
		{
			if(arr[i]==0)
				continue;
			System.out.println(arr[i]);		
		}
		sc.close();
	}

}
