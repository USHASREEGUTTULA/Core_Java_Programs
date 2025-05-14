package abstraction;

public class Person //helper class
{
	//helper non static method
	
	public static Employee getEmployee()
	{
		Employee employee =(Employee)new Developer();//Create sub class object and upcast to abstract class
		
		return employee;//return upcasted object
		
	}
	
	

}
