package Constructors;

public class Mainclass3 
{
	public static void main(String[] args) 
	{
        Circle c1 = new Circle("Red", true, 5.0);
        c1.draw();
        c1.calculateArea();

        System.out.println();

        Rectangle r1 = new Rectangle("Blue", false, 6.0, 4.0);
        r1.draw();
        r1.calculatePerimeter();
    }
}
