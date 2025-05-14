package validation_programs;

import validation_assignment.StudentValidation;

public class Student 
{
	public String name;
	public int age;
	public String address;
	public String rollno;
	public String stream;
	public String email;
	public static String collegename="NIT";
	
	
		
		//generate email
		public String generateEmail ()
		{
			String email ="";
			
			email=email+this.name+this.age+this.rollno+"@"+Student.collegename+".edu";
			
			return email;
		}
		
		
		
		public Student(String name, int age, String address, String rollno, String stream) 
		{
			
			if(StudentValidation.validateName(name) && StudentValidation.validateAge(age))
			
			this.name = name;
			this.age = age;
			this.address = address;
			this.rollno = rollno;
			this.stream = stream;
		}



//		//initialize method
//      public void initialize (String name, int age,String address,int rollno,String stream)
//	    {
//	   if(validateName(name) && validateAge(age) && validateAddress(address) && validateRollno(rollno)&& validateStream(stream))
//		{
//				this.name=name.toUpperCase();
//				this.rollno=Student.collegename.substring(0,2)+rollno;
//				this.address=address;
//				this.age=age;
//				this.email=generateEmail();
//				this.stream=stream;		
//		}
//	 
//			else 
//				
//		{
//	            System.err.println("Invalid input data! Please check the details.");
//	    }
//	}
		
		//Display method
		public void displayInfo()
		{
			System.out.println("Student Name is : "+this.name);
			System.out.println("Student Age is : "+this.age);
			System.out.println("Student Address is : "+this.address);
			System.out.println("Student Rollno is : "+this.rollno);
			System.out.println("Student College is : "+this.collegename);
			System.out.println("Student Stream is : "+this.stream);
			System.out.println("Student Email is : "+this.email);
			
		}
		
		
		
		

}
