package lab4.exercise2;

import java.util.Scanner;

public class Video extends MediaItem{
	Scanner sc = new Scanner(System.in);
	private int yop;
	private String director;
	
	public Video()
	{
		
	}
	
	Video(int id, String title, int noOfCopies,String director,int yop) {
		super(id, title, noOfCopies);
		// TODO Auto-generated constructor stub
		this.setDirector(director);
		this.setYop(yop);
	}
	public int getYop() {
		return yop;
	}
	public void setYop(int yop) {
		this.yop = yop;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	
	public void addItem()
	{
			System.out.println("Enter Video details: ");
			System.out.println("____________________");
			
			System.out.println("Enter Video's id: ");
			super.setId(sc.nextInt());
			System.out.println("Enter Video's title: ");
			super.setTitle(sc.next());
			sc.nextLine();
			System.out.println("Enter Video's Director name: ");
			setDirector(sc.next());
			sc.nextLine();
			System.out.println("Enter Video's number of copies: ");
			super.setNoOfCopies(sc.nextInt());
			sc.nextLine();
			System.out.println("Enter Video's year of publish: ");
			setYop(sc.nextInt());
	}
	
	public String toString()
	{
		return "Video Title: "+super.getTitle()+", Director: "+getDirector()+", Number of copies: "+super.getNoOfCopies()+", year of publish: "+getYop();
	}

}
