/*
 * 2) Write a java program to remove all duplicates from a given string?
 */
package handsonday3;
import java.util.*;
public class RemoveDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		int j,index=0;
		char ch[] = str.toCharArray();
		for(int i=0; i<ch.length; i++)
		{
			for(j=0; j<i; j++)
			{
				if(ch[i] == ch[j])
				{
					break;
				}
			}
			if(j == i)
			{
				ch[index++] = ch[i];
			}
		}
		System.out.println(String.valueOf(Arrays.copyOf(ch, index)));
		sc.close();
	}

}
