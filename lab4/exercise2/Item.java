package lab4.exercise2;

public abstract class Item {
	private int id;
	private String title;
	private int noOfCopies;

	Item()
	{
		
	}
	Item(int id, String title, int noOfCopies) {
		this.setId(id);
		this.setTitle(title);
		this.setNoOfCopies(noOfCopies);
	}
	protected int getNoOfCopies() {
		return noOfCopies;
	}
	protected void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}
	protected String getTitle() {
		return title;
	}
	protected void setTitle(String title) {
		this.title = title;
	}
	protected int getId() {
		return id;
	}
	protected void setId(int id) {
		this.id = id;
	}
	
	public abstract String toString();
	public abstract void addItem();
}
