/*
 * 12)Write a java program to delete a given word from the string?
 */
package handsonday3;
import java.util.*;
public class DeleteWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str=sc.nextLine();
		System.out.println("Enter a word: ");
		String word = sc.next();
		
		if(str.contains(word))
		{
			str = str.replace(word,"");
		}
		
		System.out.println("String after delete "+word+" :"+str);
		sc.close();
	}

}
