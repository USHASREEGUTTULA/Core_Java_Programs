package validation_assignment;

public class StudentReportCardSystem 

{
		public String name;
		public int age;
		public int rollno;
		
		public int math_marks;
		public int science_marks;
		public int english_marks;
		
		public int total_marks;
		public double percentage;
		public char grade;
		public boolean is_passed;
		
		// Validation methods
		public boolean validName(String name) 
		{
			if(name.length()>3)
			{
				return true;
			}
			return false;
	    }

	    public boolean validAge(int age)
	    {
	    	if(age>=5 && age<=25)
			{
				return true;
			}
			return false;
	    }

	    public boolean validRollNo(int rollno) 
	    {
	    	int count=0;
			while(rollno!=0)
			{
				rollno=rollno/10;
				count++;
			}
			return count==6;
	    }

	    public boolean validMath_Marks(int math_marks) 
	    {
	        if(math_marks>0 && math_marks<=100)
	        {
	        	return true;
	        }
	        return false;
	    }
	    public boolean validScience_Marks(int science_marks) 
	    {
	        if(science_marks>0 && science_marks<=100)
	        {
	        	return true;
	        }
	        return false;
	    }
	    public boolean validEnglish_Marks(int english_marks) 
	    {
	        if(english_marks>0 && english_marks<=100)
	        {
	        	return true;
	        }
	        return false;
	    }
	    
	    //Methods
	    public int totalMarks()
	    {
	    	total_marks=this.math_marks+this.science_marks+this.english_marks;
	    	return total_marks;
	    }
	    
	    public double calPercentage()
	    {
	    	percentage=(totalMarks()/300.0)*100;
	    	return percentage;
	    }
	    
	    public char assignGrade() 
	    {
	        percentage = calPercentage();
	        if (percentage >= 90) 
	        {
	            return 'A';
	        } 
	        else if (percentage >= 70) 
	        {
	            return 'B';
	        } 
	        else if (percentage >= 50) 
	        {
	            return 'C';
	        } 
	        else if (percentage >= 40) 
	        {
	            return 'D';
	        } 
	        else 
	        {
	            return 'F';
	        }
	    }
	    
	    public boolean isPassed() 
	    {
	        if(math_marks>40 && science_marks>40 && english_marks>40)
	        {
	        	return true;
	        }
	        return false;
	    }
	    
	    public void initialize(String name,int age,int rollno,int math_marks,int science_marks,int english_marks)
		{
			if(validName(name)&& validAge(age)&& validRollNo(rollno)&& validMath_Marks(math_marks)&& 
					validScience_Marks(science_marks)&& validEnglish_Marks(english_marks))
			{
				this.name=name;
				this.age=age;
				this.rollno=rollno;
				
				this.math_marks=math_marks;
				this.science_marks=science_marks;
				this.english_marks=english_marks;
				
				this.total_marks=totalMarks();
				this.percentage=calPercentage();
				this.grade=assignGrade();
				this.is_passed=isPassed();	
			}
			else
			{
				System.err.println("Invalid data");
			}
		}
	    
	    public void display()
	    {
	    	System.out.println("Student Name: " +name);
	    	System.out.println("Student age: "+age);
	    	System.out.println("Student rollno: "+rollno);
	    	System.out.println("Student maths marks: "+math_marks);
	    	System.out.println("Student science marks: "+science_marks);
	    	System.out.println("Student english marks: "+english_marks);
	        System.out.println("Total Marks: " + total_marks);
	        System.out.println("Percentage: " +percentage+ "%");
	        System.out.println("Grade: " + grade);
	        System.out.println("Passed: " +is_passed);
	    }
	   
	    public static void main(String[] args)
	    {
	    	StudentReportCardSystem s1= new StudentReportCardSystem();
	    	
	    	s1.initialize("Usha",22,120157,95,92,90);
	    	
	    	s1.display();
		}
	    
	  
}

