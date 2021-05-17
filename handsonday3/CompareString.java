/*
 * 4) Write a Java program to remove characters from the first string which are present in the second string?
 */
package handsonday3;
import java.util.*;
public class CompareString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two string: ");
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		char ch_1[] = str1.toCharArray();
		int count[] = new int[256];
		
		int j=0,k=0;
		
		for(int i=0; i<str2.length(); i++)
		{
			count[str2.charAt(i)]++;
		}
		while(k != ch_1.length)
		{
			char temp = ch_1[k];
			if(count[temp] == 0)
			{
				ch_1[j] = ch_1[k];
				j++;
			}
			k++;
		}
		System.out.println(String.valueOf(Arrays.copyOf(ch_1, j)));
		sc.close();
	}

}
