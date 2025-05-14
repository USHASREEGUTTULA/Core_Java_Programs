package has_a_relation;

public class Validation 
{
	public static boolean validateBookName(String bookname)
	{
		//split string at space
		String s[]=bookname.split(" ");// now we have 2 elements in array
		
		//Check if length of array is 2
		if(s.length==2)
		{
			return true;
		}
		return false;
	}
	
	public static boolean validatePrice(double price)
	{
       String s="";
		
		int count=0;//for counting number of digits after decimal point
		
		if(price>=500.00)
		{
			//To convert double size to String size
			s=s+price;
			
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
	
	

