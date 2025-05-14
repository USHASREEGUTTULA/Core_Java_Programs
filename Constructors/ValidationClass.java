package Constructors;

public class ValidationClass 
{
	public static boolean name(String name)
	{
		//split string at space
		String s[]=name.split(" ");// now we have 2 elements in array
		
		//Check if length of array is 2
		if(s.length==2)
		{
			//check if file name first char is alphabet
			if((s[1].charAt(0)>='a' && s[1].charAt(0)<='z')||(s[1].charAt(0)>='A' && s[1].charAt(0)<='Z'))
			{
				return true;
			}
		}
		return false;
	}
	public static boolean type(String type)
	{
		if(type.equalsIgnoreCase("pdf")||type.equalsIgnoreCase("txt")||type.equalsIgnoreCase("doc"))
		{
			return true;
		}
		return false;
	}
	public static boolean size(double size)
	{
		//Take an empty string to store file size
		String s="";
		
		int count=0;//for counting number of digits after decimal point
		
		if(size>=7.25 && size<=25.32)
		{
			//To convert double size to String size
			s=s+size;
			
			//take a reverse loop to check if only 2 digits are present after decimal point
			for(int i=s.length()-1;i>=0;i--)
			{
				char ch=s.charAt(i);
				
				if(ch>='0' && ch<='9')
				{
					count++;
				}
				if(ch=='.')//if . found no need to count anymore
				{
					break;
				}
			}
		}
		if(count==2)//if only 2 digits are present after decimal point
		{
			return true;
		}
		return false;
	}
}
