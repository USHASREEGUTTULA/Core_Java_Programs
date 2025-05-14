package Constructors;

public class Person 
{
	public String name;
	public int age;
	
	public void walk()
	{
		System.out.println(this.name+"is walking");
	}
	
	public void eat()
	{
		System.out.println(this.name+"is eating");
	}

	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
}
