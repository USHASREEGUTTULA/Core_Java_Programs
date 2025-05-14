package Constructors;

public class Developer extends Person
{
	public String language;
	
	public void code()
	{
		System.out.println(this.name+" is creating a code using "+this.language);
	}
	
	public Developer(String name,int age,String language)
	{
		super(name,age);
		this.language=language;
	}
	
	public void displayInfo()
	{
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.language);
	}
}
