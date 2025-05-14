package validation_assignment;

public class EmployeeManagementSystem 
{
		public String name;
		public int age;
		public double salary;
		public String designation;
		public float experience;
		
		public double annualsalary;
		public double bonus;
		public double percentage;
		
		//name
		public boolean validateName(String name)
		{
			if(name.length()>3)
			{
				return true;
			}
			return false;
		}
				
		//age
		public boolean validateAge(int age)
		{
			if(age>25)
			{
				return true;
			}
			return false;
		}
		
		//Salary
		public boolean validateSalary(double salary)
		{
			if(salary>=10000 && salary<=850000)
			{
				return true;
			}
			return false;
		}
		
		//designation
		public boolean validateDesignation(String designation)
		{
			if(designation.equals("Developer")||designation.equals("Tester"))
			{
				return true;
			}
			return false;
		}
		
         // experience
		public boolean validateExperience(float experience)
		{
			if(experience>1)
			{
				return true;
			}
			return false;
		}
		
		//initialization
		public void initialize(String name,int age,double salary,String designation,float experience)
		{
			if(validateName(name)&&validateAge(age)&&validateSalary(salary)&&validateDesignation(designation)&&
					validateExperience(experience))
		
		{
			this.name=name.toUpperCase();
			this.age=age;
			this.salary=salary;
			this.designation=designation;
			this.experience=experience;
			this.bonus=bonus;
		 }
			
		else
		{
			System.err.println("Invalid data");
		}
	}

//-----------------------------------------------------------------------------------
	
	public double annualSalary()
	{
		annualsalary=this.salary*12;
		return annualsalary;
	}
	
	public double bonus(double percentage)
	{
		bonus=(this.salary+this.salary*percentage/100);
		return bonus;
	}
	
	
	public String experiencelevel()
	{
		if(experience>1&&experience<=2)
		{
			return "Junior";
		}
		else if(experience>2&&experience<=4)
		{
			return "Mid";
		}
		else
		{
			return "Senior";
		}
	}
	
	public void promote(String new_designation,double increment)
	{
	    
	    this.salary += increment;
	   // this.annualsalary = this.salary * 12; 

	    if (designation.equalsIgnoreCase("Developer"))
	    {
	        new_designation = "Senior Developer";
	    } 
	    
	    else if (designation.equalsIgnoreCase("Tester")) 
	    {
	        new_designation = "Senior Tester";
	    } 
	    
	    else 
	    {
	        System.out.println("No promotion available.");
	        return; 
	    }

	    // Print the new designation and increment details
	    System.out.println("The new designation is: " + new_designation);
	    System.out.println("The incremented salary is: " + salary);
	}
	
	public void displayInfo()
	{
		System.out.println("Employee name is:"+this.name);
		System.out.println("Employee age is:"+this.age);
		System.out.println("Employee salary is:"+this.salary);
		System.out.println("Employee designation is:"+this.designation);
		System.out.println("Employee annual salary is:"+this.annualSalary());
		System.out.println("Employee bonus is:"+this.bonus(10));
		System.out.println("Employee experience level is:"+this.experiencelevel());
	}
	public static void main(String[] args)
	{
		EmployeeManagementSystem emp1= new EmployeeManagementSystem();
		emp1.initialize("sravya", 27, 40000,"Developer",2);
		emp1.displayInfo();
		emp1.promote("JAVA",10);
		
		
	}
			

}
