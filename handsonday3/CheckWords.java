/*
 * 15)Write a java program to find repeated words in a given string?
 */
package handsonday3;
import java.util.*;
public class CheckWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		String words[] = str.split(" ");
		int count = 0;
		System.out.println("Duplicate Strings: ");
		 for(int i = 0; i < words.length; i++) 
		 {  
			 count = 1;  
	         for(int j = i+1; j < words.length; j++) 
	         {  
	                if(words[i].equals(words[j])) 
	                {  
	                    count++;  
	                    words[j] = "0";  
	                }  
	          }
	         if(count > 1 && words[i] != "0")  
	                System.out.println(words[i]);  
		 }
		 sc.close();
	}

}
