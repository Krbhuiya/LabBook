/*
 * Exercise 1: 
 * Write a Java program that reads a line of integers and then displays each integer and the sum of all integers. 
 * (Use String Tokenizer class)?
 */
package lab3;
import java.util.*;
public class SumOfIntegers {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter the values: ");
		String values = sc.nextLine();
		StringTokenizer st = new StringTokenizer(values," ");
		System.out.println("Elements are: ");
		while(st.hasMoreTokens())//hasMoreToken same as hasMoreElements(). checks if there is more tokens available.
		{
			String str = (String)st.nextElement();//nextElement returns object and then it is converting into string.
			int x = Integer.parseInt(str);//converting string into integer.
			System.out.println(x);
			sum += x;
			
		}
		System.out.println("Sum of all numbers: "+sum);
		sc.close();
	}
}
