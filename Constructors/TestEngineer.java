package Constructors;

public class TestEngineer extends Person
	
	{
		public String typeOfTester;
		
		public void test()
		{
			System.out.println(this.name+" is creating a code using "+this.typeOfTester);
		}
		
		public TestEngineer (String name,int age,String typeOfTester)
		{
			super(name,age);
			this.typeOfTester=typeOfTester;
		}
		
		public void displayInfo()
		{
			System.out.println(this.name);
			System.out.println(this.age);
			System.out.println(this.typeOfTester);
		}
	}



