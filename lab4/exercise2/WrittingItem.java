package lab4.exercise2;

public abstract class WrittingItem extends Item {

	private String author;

	WrittingItem()
	{

	}
	WrittingItem(int id, String title, int noOfCopies,String author) {
		super(id, title, noOfCopies);
		// TODO Auto-generated constructor stub
		this.setAuthor(author);
	}
	protected String getAuthor() {
		return author;
	}
	protected void setAuthor(String author) {
		this.author = author;
	}

	public abstract String toString();
	public abstract void addItem();
}
