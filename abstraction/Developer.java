package abstraction;
//sub class
public class Developer extends Employee
{
//implement abstract methods
	@Override
	public void job() 
	{
		System.out.println("Job is Developer");
		
	}

	@Override
	public void salary() 
	{
		System.out.println("Developer salary is .....");
		
	}

}
