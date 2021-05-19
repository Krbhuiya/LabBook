package handsonday5.polymorphismone;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Account No.: ");
		int accno = sc.nextInt();
		
		System.out.println("Enter deposit amount.: ");
		int d_amount = sc.nextInt();
		
		System.out.println("Enter withdrawal amount.: ");
		int w_amount = sc.nextInt();
		
		
		BalanceEnquiry be = new BalanceEnquiry();
		be.Execute();
		
		Deposit d = new Deposit();
		d.setAccno(accno);
		d.setAmount(d_amount);
		d.Execute();
		
		Withdrawal w = new Withdrawal();
		w.setAccno(accno);
		w.setAmount(w_amount);
		w.Execute();
		
		sc.close();
	}

}
