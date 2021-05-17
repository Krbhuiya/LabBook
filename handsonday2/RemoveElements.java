/*
 * write a Java program to remove an element by taking an index from the user?
 */
package handsonday2;
import java.util.Scanner;
public class RemoveElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int arr_1[] = new int[n-1]; 
		System.out.println("Enter the array elements: ");
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the index value: ");
		int index = sc.nextInt();
		for(int i=0,j=0; i<n; i++)
		{
			if(i != index)
			{
				arr_1[j] = arr[i];
				j++;
			}
		}
		for(int i=0; i<arr_1.length; i++)
		{
			System.out.println(arr_1[i]);
		}
		sc.close();
	}

}
