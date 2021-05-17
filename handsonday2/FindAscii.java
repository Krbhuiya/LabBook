/*
 * Character to Ascii
 */
package handsonday2;
import java.util.Scanner;
public class FindAscii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char c = sc.next().charAt(0);
		int asc = (int)c;
		System.out.println(c+" Ascii value is: "+asc);
		sc.close();
	}

}
