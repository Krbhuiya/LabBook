/*
 * 10)Write a java program to check whether at given index is character or symbol?
 */
package handsonday3;
import java.util.*;
public class CheckString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		System.out.println("Enter the index value: ");
		int n = sc.nextInt();

		if(n<= str.length())
		{
			Boolean flag = Character.isDigit(str.charAt(n));
			Boolean flag_1 = Character.isLetter(str.charAt(n));
			if(flag)
			{
				  System.out.println("'"+ str.charAt(n)+"' is a number");
			}
			else if(flag_1)
			{
				System.out.println("'"+ str.charAt(n)+"' is a character");
			}
			else
			{
				System.out.println("'"+ str.charAt(n)+"' is a symbol");
			
			}
			sc.close();
	}
	
	}
}
