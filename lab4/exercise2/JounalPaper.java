package lab4.exercise2;

import java.util.Scanner;

public class JounalPaper extends WrittingItem{
	Scanner sc = new Scanner(System.in);
	private int yop;
	
	public JounalPaper()
	{
		
	}
	JounalPaper(int id, String title, int noOfCopies,String author,int yop) {
		super(id, title, noOfCopies,author);
		// TODO Auto-generated constructor stub
		this.setYop(yop);
	}
	public int getYop() {
		return yop;
	}
	public void setYop(int yop) {
		this.yop = yop;
	}
	
	public void addItem()
	{
			System.out.println("Enter Jounal Paper details: ");
			System.out.println("____________________");
			
			System.out.println("Enter JounalPaper's id: ");
			super.setId(sc.nextInt());
			System.out.println("Enter JounalPaper's title: ");
			super.setTitle(sc.next());
			sc.nextLine();
			System.out.println("Enter JounalPaper's author name: ");
			super.setAuthor(sc.next());
			sc.nextLine();
			System.out.println("Enter JounalPaper's number of copies: ");
			super.setNoOfCopies(sc.nextInt());
			sc.nextLine();
			System.out.println("Enter JounalPaper's year of publish: ");
			setYop(sc.nextInt());
	}
	
	public String toString()
	{
		return "Jounal Paper Title: "+super.getTitle()+", Author: "+super.getAuthor()+", Number of copies: "+super.getNoOfCopies()+", Year of publish: "+yop;
	}

}
