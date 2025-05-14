package inheritance_programs;

public class Student
{
	public String name;
	public int rollno;
	public int age;
	
	 public void initialize1(String name,int rollno,int age)
	   {
		   this.name=name;
		   this.rollno=rollno;
		   this.age=age;
		   
		  
	   }
	   
	   public void displayinfo1()
	   {
		   System.out.println("Student Name is : "+name);
		   System.out.println("Student Roll Number is : "+rollno);
		   System.out.println("Student  age is : "+age);
		   
	
	   }
	   
}
