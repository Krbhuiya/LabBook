/*
 * Exercise 2: 
 * Create a class containing a method to create the mirror image of a String. 
 * The method should return the two Strings separated with a pipe(|) symbol .
 */
package lab3;
import java.util.*;
public class MirrorImage {

	public static String getImage(String str) 
	{
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		return str+"|"+sb;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		String s = getImage(str);
		System.out.println(s);
		sc.close();
	}

}
