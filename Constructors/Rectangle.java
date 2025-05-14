package Constructors;

public class Rectangle extends Shape 
{
	public double length;
	public double width;

	public Rectangle(String color, boolean isFilled, double length, double width) 
	{
        this.color = color;
        this.isFilled = isFilled;
        this.length = length;
        this.width = width;
    }

	public void calculatePerimeter() 
	{
        System.out.println("Rectangle Perimeter: " + (2 * (length + width)));
    }
}