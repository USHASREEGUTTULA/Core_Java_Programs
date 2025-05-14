package abstraction;

//users code
public class MainClass 
{
	public static void main(String[] args) 
	{
		//create object for helper class
		Person person=new Person();
		
		//call the helper non static method using object reference variable of helper class created 
		Employee employee=person.getEmployee();
		
		//with object reference variable of Employee class call methods
		employee.job();
		
		employee.salary();
		
	}

}
