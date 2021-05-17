/*
 * Write  a Java Program to count number of duplicated values in
	a) integer array
	b) char array (create the char array in lower case)
 */
package handsonday2;
import java.util.Scanner;
public class DuplicateValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array: ");
		int len = sc.nextInt();
		int arr_int[] = new int[len];
		char arr_char[] = new char[len];
		System.out.println("Enter the integer array values: ");
		for(int i=0; i<len; i++)
		{
			arr_int[i] = sc.nextInt();
		}
		for(int i=0; i<len; i++)
		{
			for(int j=i+1; j<len; j++)
			{
				if(arr_int[i] == arr_int[j])
				{

					System.out.println("Duplicate value found: "+ arr_int[i]);
				}
			}
		}
		System.out.println("Enter the character array values: ");
		for(int i=0; i<len; i++)
		{
			arr_char[i] = sc.next().charAt(0);
		}
		for(int i=0; i<len; i++)
		{
			for(int j=i+1; j<len; j++)
			{
				if(arr_char[i] == arr_char[j])
				{

					System.out.println("Duplicate value found: "+ arr_char[i]);
				}
			}
		}
		sc.close();

	}

}
