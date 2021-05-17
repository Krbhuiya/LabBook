package handsonday2;
import java.util.Scanner;
public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length and breadth of rectangle: ");
		int length = sc.nextInt();
		int breadth = sc.nextInt();
		int area = length * breadth;
		int perimeter = 2*(length+breadth);
		System.out.println("Area of rectangle: "+area+" Perimeter of rectangle: "+perimeter);
		sc.close();
	}

}
