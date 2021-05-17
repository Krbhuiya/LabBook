/*
 * 6)How to reverse a String with out using string functions?
 */
package handsonday3;
import java.util.*;
public class StringRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		int len = str.length();
		char ch[] = str.toCharArray();
		for(int i= len-1; i>=0; i--)
		{
			System.out.print(ch[i]);
		}
		sc.close();
	}

}
