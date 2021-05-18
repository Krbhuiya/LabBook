package handsonday4.inhertancetwo;

public class Main {

	public static void main(String []args)
	{
		Shape obj_shape = new Shape("red",true);
		Rectangle obj_rect = new Rectangle(10,15);
		
	
		obj_rect.setColor(obj_shape.getColor());
		obj_rect.setFilled(obj_shape.isFilled());
		
		Square obj_sq = new Square(20,obj_shape.getColor(),obj_shape.isFilled());
		obj_sq.setWidth(obj_sq.getSide());
		obj_sq.setLength(obj_sq.getSide());
		
		Circle obj_cir = new Circle(10);
		obj_cir.setColor(obj_shape.getColor());
		obj_cir.setFilled(obj_shape.isFilled());
		
		System.out.println(obj_shape);
		System.out.println(obj_rect);
		System.out.println(obj_sq);
		System.out.println(obj_cir);
	}
	
}
