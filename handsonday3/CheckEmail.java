/*
 * 14)Write a java program to check given email contains @ and .?
 */
package handsonday3;
import java.util.*;
public class CheckEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a email: ");
		String str = sc.nextLine();
		int count[] = new int[256];
		int flag = 0;
		for(int i=0; i<str.length(); i++)
		{
			count[str.charAt(i)]++;
		}
		for(int i=0; i<256; i++)
		{
			if(count[64] >= 1 && count[46] >=1)
			{
				
				flag = 1;
			}
			else
			{
				flag = 0;
				break;
				
			}
		}
		if(flag == 1)
		{
			System.out.println("Email contains @ and .");
		}
		else
		{
			System.out.println("Email does not contain @ and .");
		}
		sc.close();
	}
	

}
