package Constructors;

public class Circle extends Shape 
{
	public double radius;

	public Circle(String color, boolean isFilled, double radius) 
	{
        this.color = color;
        this.isFilled = isFilled;
        this.radius = radius;
    }

	public void calculateArea() 
	{
        System.out.println("Circle Area: " + (3.14 * radius * radius));
    }
}
