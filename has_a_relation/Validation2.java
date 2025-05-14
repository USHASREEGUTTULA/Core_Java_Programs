package has_a_relation;

public class Validation2
{
	public static boolean validateName(String name)
	{
		if(name.length()>3)
		{
			return true;
		}
		return false;
	}
	
	public static boolean validateMobileNum(long mobilenum)
	{
		while(mobilenum>0)
		{
			long ld=mobilenum%10;
			if(ld==0)
			{
				return true;
			}
		}
	return false;
	}
	
	public static boolean validateEmail(String email)
	{
		for(int i =1;i<=email.length()-1;i++)
		{
		char ch=email.charAt(i);
			if(ch=='@')
			{
				return true;
			}
		}
		return false;
	}
		
	
	public static boolean validateType(String type)
	{
		if(type.equalsIgnoreCase("Jpg")||type.equalsIgnoreCase("Png"))
		{
			return true;
		}
		return false;
	}
	
	public static boolean validateSize(int size)
	{
		if(size>=64 && size<=128)
		{
			return true;
		}
		return false;
	}
	
	public static boolean validateResolution(int resolution)
	{
		if(resolution>=640 && resolution<=1280)
		{
			return true;
		}
		return false;
	}
	
	
	
	

}
