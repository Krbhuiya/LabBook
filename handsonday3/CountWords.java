/*
 * 9)count number of words in the given string?
 */
package handsonday3;
import java.util.*;
public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		int count = 0;
		String words[] = str.split(" ");
		
		for(int i=0; i<words.length; i++)
		{
			count++;
		}
		System.out.println(count);
		sc.close();
	}

}
