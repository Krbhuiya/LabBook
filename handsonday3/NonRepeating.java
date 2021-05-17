/*
 * 7)Find the non repeating character in a given string?
 */
package handsonday3;
import java.util.*;
public class NonRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		
		int count[] = new int[256];
		for(int i=0; i<str.length(); i++)
		{
			count[str.charAt(i)]++;
		}
		for(int i=0; i<256; i++)
		{
			if(count[i] == 1)
			{
				System.out.println("Non Repeating Character: "+(char)i);
			}
		}
		sc.close();
	}

}
