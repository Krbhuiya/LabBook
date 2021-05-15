/*Create a method to find the sum of the cubes of the digits of an n digit number
 * 
 */
package jeefscorejava;
import java.util.Scanner;
public class DigitCube {
	
	static int Digitcube(int num)
	{
		int x,sum=0;
		while(num != 0)
		{
			x = num % 10;
			sum = sum + x*x*x;
			num = num /10;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int cube = Digitcube(n);
		System.out.println("Cube value of digits: "+cube);
		sc.close();
	}

}
