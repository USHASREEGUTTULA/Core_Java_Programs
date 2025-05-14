package has_a_relation;

public class Author 
{
	private String name;
	private int age;
	private String place;
	
	public Author(String name,int age,String place)
	{
		this.name=name;
		this.age=age;
		this.place=place;
	}
	
	public void displayInfo()
	{
		System.out.println("Author name ="+this.name);
		System.out.println("Author age ="+this.age);
		System.out.println("Author place ="+this.place);
	}

}
