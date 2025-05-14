package has_a_relation;

public class MainClass 
{
	public static void main(String[] args)
	{
		Book b=new Book("Good Vibes",750.85,new Author("Usha",21,"Hyd"));
		b.displayInfo();
	}

}
