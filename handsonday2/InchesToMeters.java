package handsonday2;
import java.util.Scanner;
public class InchesToMeters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length in inches: ");
		int inch = sc.nextInt();
		double meter = inch/39.3700787;
		System.out.println(inch+" inch = "+meter+" meter");
		sc.close();
	}

}
