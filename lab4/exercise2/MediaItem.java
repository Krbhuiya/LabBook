package lab4.exercise2;

public abstract class MediaItem extends Item {

	public MediaItem()
	{
		
	}
	MediaItem(int id, String title, int noOfCopies) {
		super(id, title, noOfCopies);
		// TODO Auto-generated constructor stub
	}
	
	public abstract String toString();
	public abstract void addItem();
}
