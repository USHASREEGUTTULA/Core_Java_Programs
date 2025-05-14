package private_members;

public class Rectangle extends Shape
{
	private int length;
	private int bredth;
	private int rectanglearea;
	

	public Rectangle(String color,String typeofshape)
	{
		super(color,typeofshape);
		 if(!(getTypeOfShape().equalsIgnoreCase("rectangle")))
		 {
			 System.out.println("invalid shape entered");
		 }
	}
	
	public int getArea(int length,int bredth)
	{
		if(Validation.validateLength(length) && Validation.validateBredth(bredth))
		{
			this.length=length;
			this.bredth=bredth;
			
			rectanglearea=length*bredth;	
		}
		return rectanglearea;
	}
	
	public void display()
	{
		System.out.println("Rectangle Area is : "+getArea(150,30));
	}
}
