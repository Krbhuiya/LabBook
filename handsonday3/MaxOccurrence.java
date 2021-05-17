/*
 * 1) How to find the maximum  occurring character in a given string?
 */
package handsonday3;
import java.util.*;
public class MaxOccurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		
		char ch[] = str.toCharArray();
		int arr[] = new int[ch.length];
		char maxChar = str.charAt(0);  
		
		for(int i=0; i<ch.length; i++)
		{
			arr[i] = 1;
			for(int j=i+1; j<ch.length; j++ )
			{
				if(ch[i] == ch[j] && ch[i] != ' ' && ch[i] != '0')
				{
					arr[i]++;
					ch[j] = '0';
				}
				
			}
		}
		int max = arr[0];
		
		for(int i=0; i<arr.length; i++)
		{
			if(max < arr[i])
			{
				max = arr[i];
				maxChar = ch[i];
			}
			
		}
		System.out.println("Maximum occurring character: " + maxChar); 
		sc.close();
	}

}
