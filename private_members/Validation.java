package private_members;

public class Validation 
{
	//Shape class
	public static boolean validateColor(String color)
	{
		if(color.equals("Red")||color.equals("Blue")||color.equals("Black"))
		{
			return true;
		}
		return false;
	}
	
	public static boolean validateTypeOfShape(String typeofshape)
	{
		if(typeofshape.equals("Rectangle")||typeofshape.equals("Triangle")||typeofshape.equals("Circle"))
		{
			return true;
		}
		return false;
	}
	
	//Rectangle class
	public static boolean validateLength(int length)
	{
		if(length>=100 && length<=200)
		{
			return true;
		}
		return false;
	}
	
	public static boolean validateBredth(int bredth)
	{
		if(bredth>=20 && bredth<=60)
		{
			return true;
		}
		return false;
	}
	
	//Triangle class
	
	public static boolean validateBase(int base)
	{
		if(base>=10 && base<=50)
		{
			return true;
		}
		return false;
	}
	
	public static  boolean validateHeight(int height)
	{
		if(height>=50 && height<=100)
		{
			return true;
		}
		return false;
	}
	
	//Circle class
	
	public static boolean validateRadius(int radius)
	{
		if(radius>=1 && radius<=100)
		{
			return true;
		}
		return false;
	}
	

}
