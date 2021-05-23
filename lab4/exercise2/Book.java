package lab4.exercise2;
import java.util.*;
public class Book extends WrittingItem{
	Scanner sc = new Scanner(System.in);
	public Book()
	{
	
	}
	Book(int id, String title, int noOfCopies,String author) {
		super(id, title, noOfCopies,author);
		// TODO Auto-generated constructor stub
	}

	public void addItem()
	{
			
			System.out.println("Enter book details: ");
			System.out.println("____________________");
			
			System.out.println("Enter book's id: ");
			super.setId(sc.nextInt());
			System.out.println("Enter book's title: ");
			super.setTitle(sc.next());
			sc.nextLine();
			System.out.println("Enter book's author name: ");
			super.setAuthor(sc.next());
			sc.nextLine();
			System.out.println("Enter book's number of copies: ");
			super.setNoOfCopies(sc.nextInt());
			//sc.close();
	}
	
	public String toString()
	{
		return "Book Title: "+super.getTitle()+", Author: "+super.getAuthor()+", Number of copies: "+super.getNoOfCopies();
	}
}
