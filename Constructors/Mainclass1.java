package Constructors;

public class Mainclass1 
{
   public static void main(String[] args)
   {
	        // Creating Dog object
	        Dog d1 = new Dog("Buddy", 3, 25.5, "Golden Retriever", true, "Golden");
	        d1.eat();
	        d1.sleep();
	        
	        d1.bark();
	        d1.fetch();

	        System.out.println();

	        // Creating Cat object
	        Cat c1 = new Cat("Whiskers", 2, 5.0, "White", true, "Fish");
	        c1.eat();
	        c1.sleep();
	        
	        c1.meow();
	        c1.scratch();
	    }
	}


