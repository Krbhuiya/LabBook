package handsonday2;
import java.util.Scanner;
public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of circle: ");
		int radius = sc.nextInt();
		double area = Math.PI * radius * radius;
		double perimeter = 2 * Math.PI * radius;
		System.out.println("Area of circle: "+area+" Perimeter of circle: "+perimeter);
		sc.close();
	}

}
