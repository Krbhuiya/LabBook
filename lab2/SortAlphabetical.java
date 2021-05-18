/*
 * Exercise 2: Create a method that can accept an array of String objects and sort in alphabetical order. 
 * The elements in the left half should be completely in uppercase and the elements in the right half should be completely in lower case. 
 * Return the resulting array.
 */
package lab2;
import java.util.Scanner;
public class SortAlphabetical {

	public static String sortStrings(String[] arr)
	{
		int len = arr.length;
		for(int i=0; i<len-1; i++)
		{
			for(int j=1+1; j<len; j++)
			{
				if(arr[i].compareTo(arr[j]) > 0)
				{
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		if(len%2 == 0)
		{
			int x = len/2;
			int y = len - x;
			for(int i=0; i<x; i++)
			{
				arr[i].toUpperCase();
			}
			for(int i=x+1; i<y; i++)
			{
				arr[i].toLowerCase();
			}
		}
		else
		{
			for(int i=0; i<(len/2)+1; i++)
			{
				arr[i].toUpperCase();
			}
		}
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<len; i++)
		{
			sb.append(arr[i]);
		}
		String str = sb.toString();
		return str;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of string: ");
		int n = sc.nextInt();
		String str[] = new String[n];
		for(int i=0; i<n; i++)
		{
			str[i] = sc.next();
		}
		
		String val = sortStrings(str);
		System.out.println(val);
		sc.close();
	}

}
