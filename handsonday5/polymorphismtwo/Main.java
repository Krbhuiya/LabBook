package handsonday5.polymorphismtwo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Admin Name: ");
		String ADname = sc.next();
		System.out.println("Enter Admin Salary: ");
		double ADsal = sc.nextDouble();
		
		System.out.println("Enter Name: ");
		String name = sc.next();
		System.out.println("Enter Salary");
		double sal = sc.nextDouble();
		
		Admin ad = new Admin();
		ad.setName(ADname);
		ad.setSalary(ADsal);
		ad.adjustSalary(50000);
		
		Academic a = new Academic();
		a.setName(name);
		a.setSalary(sal);
		a.adjustSalary(40000);
		
		sc.close();
	}

}
