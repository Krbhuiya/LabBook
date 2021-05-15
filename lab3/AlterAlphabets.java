/*
 * Exercise 3: 
 * Create a method which accepts a String and replaces all the consonants in the String with the next alphabet. 
 * Note: Consonant refers to all alphabets excluding vowels
 */
package lab3;
import java.util.*;
public class AlterAlphabets {
	
	public static String alterString(String str)
	{
		char ch[] = new char[str.length()];
		for(int i=0; i<str.length();i++)
		{
			ch[i] = str.charAt(i);
		}
		for(int i=0; i<ch.length; i++)
		{
			if(!(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u'))
			{
				if(ch[i] == 'z')
				{
					ch[i] = 'b';
				}
				else
				{
					
					if((char)(ch[i]+1) == 'a'|| (char)(ch[i]+1) == 'e' || (char)(ch[i]+1) == 'i' || (char)(ch[i]+1) == 'o' || (char)(ch[i]+1) == 'u')
					{
						ch[i] = (char)(ch[i]+2);
					}
					else
					{
						ch[i] = (char)(ch[i]+1);
					}
					
				}
			}		
		}
		
		return String.valueOf(ch);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.nextLine();
		String s = alterString(str);
		System.out.println(s);
		sc.close();
	}

}
