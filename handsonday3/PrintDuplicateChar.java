/*
 * 3) Write a to print dulipcate characters  from the given string?
 */
package handsonday3;
import java.util.*;
public class PrintDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		char ch[] = str.toCharArray();
		int j,index=0;
		
		for(int i=0; i<ch.length; i++)
		{
			for(j=0; j<i; j++)
			{
				if(ch[i] == ch[j])
				{
					ch[index++] = ch[i];
				}
			}
		}
		System.out.println("Duplicate Characters: "+String.valueOf(Arrays.copyOf(ch, index)));
		sc.close();
	}

}
