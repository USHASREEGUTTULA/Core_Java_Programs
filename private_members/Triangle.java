package private_members;

public class Triangle extends Shape
{
	private int base;
	private int height;
	private double trianglearea;
	
	public Triangle(String color,String typeofshape)
	{
		super(color,typeofshape);
		
	}
	
	public double getArea(int base,int height)
	{
		if(Validation.validateBase(base) && Validation.validateHeight(height))
		{
			this.base=base;
			this.height=height;
			
			trianglearea=0.5*base*height;
		}
		return trianglearea;
	}
	public void display()
	{
		System.out.println("Triangle Area is : "+getArea(30,90));
	}
}
