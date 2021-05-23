package lab4.exercise2;

import java.util.Scanner;

public class CD extends MediaItem{
	Scanner sc = new Scanner(System.in);
	private String artist;
	
	public CD()
	{
		
	}
	CD(int id, String title, int noOfCopies,String artist) {
		super(id, title, noOfCopies);
		// TODO Auto-generated constructor stub
		this.artist = artist;
	}
	
	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public void addItem()
	{
			System.out.println("Enter Video details: ");
			System.out.println("____________________");
			
			System.out.println("Enter CD's id: ");
			super.setId(sc.nextInt());
			System.out.println("Enter CD's title: ");
			super.setTitle(sc.next());
			sc.nextLine();
			System.out.println("Enter CD's Artist name: ");
			setArtist(sc.next());
			sc.nextLine();
			System.out.println("Enter CD's number of copies: ");
			super.setNoOfCopies(sc.nextInt());
	}
	public String toString()
	{
		return "CD Title: "+super.getTitle()+", Artist: "+getArtist()+", Number of copies: "+super.getNoOfCopies();
	}
}
