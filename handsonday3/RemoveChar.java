/*
 * 8) how to remove  a given character from a string?
 */
package handsonday3;
import java.util.*;
public class RemoveChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		System.out.println("Enter a character: ");
		char c = sc.next().trim().charAt(0);
		char ch[] = str.toCharArray();
		int j=0;
		for(int i=0; i<ch.length; i++)
		{
			if(ch[i] == c)
			{
				continue;
			}
			else
			{
				ch[j] = ch[i];
				j++;
			}
		}
		System.out.println(String.valueOf(Arrays.copyOf(ch, j)));
		sc.close();
	}

}
