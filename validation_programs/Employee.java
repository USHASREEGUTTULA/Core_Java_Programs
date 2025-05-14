package validation_programs;

public class Employee 
{
	public String name;
	public int age;
	public String designation;
	public double salary;
	public static String companyname="Google";
	
	
	public double bonus;
	public double actualsalary;
	public double tax;
	private double annualsalary;
	
	
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
			if (age>=25 && age<=30)
			{
				return true;
			}
			return false;
		}
		
	//Salary
		public static boolean validateSalary (double salary)
		{
			if (salary>=10000 && salary<=70000)
			{
				return true;
			}
			return false;
		}

		//Designation
		public boolean validateDesignation (String designation)
		{
			if (designation.equals("Developer")||designation.equals("Test Engineer")||designation.equals("Hr")||designation.equals("Manager"))
			{
				return true;
			}
			return false;
		}

		//initialize method
	    public void initialize (String name, int age,double salary,String designation)
		    {
		   if(validateName(name) && validateAge(age) && validateSalary(salary) && validateDesignation(designation))
			{
					this.name=name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase();
					this.age=age;
					this.salary=salary;
					this.designation=designation;
					this.annualsalary=generateAnnualSalary();
					this.bonus=generateBonus();
					this.actualsalary=generateActualSalary();
			
			}
		 
				else 
					
			{
		            System.err.println("Invalid input data! Please check the details.");
		    }
		}
	    
	  //Display method
		public void displayInfo()
		{
			System.out.println("Student Name is : "+this.name);
			System.out.println("Student Age is : "+this.age);
			System.out.println("Student Salary is : "+this.salary);
			System.out.println("Student Designation is : "+this.designation);
			System.out.println("Student Company is : "+this.companyname);
			System.out.println("Student AnnualSalary is : "+this.annualsalary);
			System.out.println("Student Bonus is : "+this.bonus);
			System.out.println("Student ActualSalary is : "+this.actualsalary);
			
		}
			
				
	//Annual Salary
	public double generateAnnualSalary ()
	{
		double annualsalary=this.salary*12;
		return annualsalary;
	}
	
	//Bonus
		public double generateBonus ()
		{
			bonus=this.salary+this.salary*10/100;
			return bonus;
		}
		
	//Actual Salary
	   public double generateActualSalary ()
		{
		 
			this.actualsalary=this.salary-tax;
			return actualsalary;
		}
					
		
	

}
