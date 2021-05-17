/*
 * 5) Write a java program to check if two strings are anagram are not?
 */
package handsonday3;
import java.util.*;
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two string: ");
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		int count_1[] = new int[256];
		int count_2[] = new int[256];
		
		int flag = 0;
		
		for(int i=0; i<str1.length(); i++)
		{
			count_1[str1.charAt(i)]++;
		}
		
		for(int i=0; i<str2.length(); i++)
		{
			count_2[str2.charAt(i)]++;
		}
		
		for(int i=0; i<256; i++)
		{
			if(count_1[i] == count_2[i])
			{
				flag = 1;
			}
			else
			{
				flag = 0;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not Anagram");
		}
		sc.close();
	}

}
