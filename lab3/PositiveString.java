/*
 * Exercise 8: Create a method that accepts a String and checks if it is a positive string.
 */
package lab3;
import java.util.*;
public class PositiveString {

	public static void CheckString(String str)
	{
		char ch[] = new char[str.length()];
		int flag = 0 ;
		for(int i=0; i<str.length(); i++)
		{
			ch[i] = str.charAt(i);
		}
		for(int i=0; i<str.length()-1; i++)
		{
			if(ch[i] < ch[i+1])
			{
				flag = 1;
			}
			else
			{
				flag = 0;
				break;
			}
		}
		if( flag == 1 )
		{
			System.out.println("Positive string");
		}
		else
		{
			System.out.println("Not Positive string");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		CheckString(str);
		sc.close();
	}

}
