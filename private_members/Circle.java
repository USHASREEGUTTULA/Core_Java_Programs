package private_members;

public class Circle extends Shape
{
	private int radius;
	private static double pi=3.14;
	private double circlearea;
	
	public Circle(String color,String typeofshape)
	{
		super(color,typeofshape);
		
		
	}
	
	public double getArea(int radius)
	{
		if(Validation.validateRadius(radius))
		{
			this.radius=radius;
			
			circlearea=Circle.pi*radius;
		}
		return circlearea;
	}
	 
	public void display()
	{
		System.out.println("Circle Area is : "+getArea(50));
	}
}
