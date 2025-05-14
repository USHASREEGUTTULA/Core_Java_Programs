package validation_assignment;

public class StudentValidation 
{
	//Name
		public static boolean validateName (String name)
		{
			if (name.length()>3)
			{
				return true;
			}
			return false;
			
		}
		
		//Age
			public static boolean validateAge (int age)
			{
				if (age>=15 && age<=25)
				{
					return true;
				}
				return false;
			}
			
		//Address
			public static boolean validateAddress (String address)
			{
				if (address.length()>=10)
				{
					return true;
				}
				return false;
			}
		
	//RollNumber
			public static boolean validateRollno (int rollno)
			{
				int count=0;
				
				while(rollno!=0)
				{
					rollno=rollno/10;
					count++;
					
				}
				return count==4;
			}
			
			
			//Stream
			public static boolean validateStream (String stream)
			{
				if (stream.equals("CSE")||stream.equals("IS")||stream.equals("IT")||stream.equals("ECE")||stream.equals("EEE"))
				{
					return true;
				}
				return false;
			}
}
