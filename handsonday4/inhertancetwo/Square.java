package handsonday4.inhertancetwo;

public class Square extends Rectangle{
	
	private double side;
	public Square()
	{

	}
	
	public Square(double side)
	{
		this.side = side;
	}
	public Square(double side,String color,boolean filled)
	{
		setColor(color);
		setFilled(filled);
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
	public void setWidth(double side)
	{
		super.setWidth(side);
	}
	public void setLength(double side)
	{
		super.setLength(side);
	}
	
	public String toString()
	{
		return "Square[Rectangle[Shape[color= "+super.getColor()+", filled= "+super.isFilled()+"], width: "+super.getWidth()+", length= "+super.getLength()+"]]";
	}
	
}
