package private_members;

public class MainClass 
{
	public static void main(String[] args)
	{
		
		Rectangle r=new Rectangle("Red","Circle");
		Triangle t=new Triangle("Blue","Triangle");
		Circle c=new Circle("Black","Rectangle");
		 
		r.display();
		t.display();
		c.display();
	
		
		
	}
}
