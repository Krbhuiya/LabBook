/*
 * Write a Java program to merge two unsorted arrays of different lengths?
 */
package handsonday2;
import java.util.Scanner;
public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr_1[] = new int[10];
		int arr_2[] = new int[10];
		int arr_3[] = new int[20];
		int m=0,n=0,k=0;
		System.out.println("Enter 10 elements of first array : ");
		for(int i=0; i<10; i++)
		{
			arr_1[i] = sc.nextInt();
		}
		System.out.println("Enter 10 elements of second array : ");
		for(int i=0; i<10; i++)
		{
			arr_2[i] = sc.nextInt();
		}
		while(m < arr_1.length)
		{
			arr_3[n] = arr_1[m];
			m++;
			n++;
		}
		while(k < arr_2.length)
		{
			arr_3[n] = arr_2[k];
			k++;
			n++;
		}
		for(int i=0; i<20; i++)
		{
			System.out.println(arr_3[i]+" " );
		}
		sc.close();
	}

}
