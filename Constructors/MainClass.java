package Constructors;

public class MainClass 
{
	public static void main(String[] args)
	{
		Developer d1=new Developer("Usha",21,"Java");
		d1.displayInfo();
		d1.code();
		
		TestEngineer t1=new TestEngineer ("Sam",21,"Manual");
		t1.displayInfo();
		t1.test();
	}
}
