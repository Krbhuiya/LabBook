package handsonday4.inhertancetwo;

public class Circle extends Shape{

	private double radius;

	public Circle()
	{
		
	}
	public Circle(double radius)
	{
		this.radius = radius;
	}
	public Circle(double radius, String color,boolean filled)
	{
		super(color,filled);
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public String toString()
	{
		return "Circle[Shape[color= "+getColor()+", filled= "+isFilled()+"], radius="+getRadius()+"]";
	}
}
