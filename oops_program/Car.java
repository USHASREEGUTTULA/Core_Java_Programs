package oops_program;

public class Car extends Vehicle 
{
	    private int doors;
	    
	    public Car()
	    {
	    	super();
	    }
	    
	    // Polymorphism: Constructor Overloading
	    public Car(String brand, int speed)
	    {
	        super(brand, speed);
	        this.doors = 4; // Default
	    }

	    public Car(String brand, int speed, int doors)
	    {
	        super(brand, speed);
	        this.doors = doors;
	    }

	    // Overriding: Implementing abstract method
	    @Override
	    public void displayDetails()
	    {
	        System.out.println("Car Brand: " + getBrand() + ", Speed: " + getSpeed() + "km/h, Doors: " + doors);
	    }
	}

