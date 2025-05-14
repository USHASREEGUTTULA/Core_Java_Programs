package oops_program;

public class Bike extends Vehicle 
{
	    private boolean hasGear;

	    public Bike(String brand, int speed, boolean hasGear) 
	    {
	        super(brand, speed);
	        this.hasGear = hasGear;
	    }

	    public Bike() 
	    {
			
		}

		// Overriding: Implementing abstract method
	    @Override
	    public void displayDetails() 
	    {
	        System.out.println("Bike Brand: " + getBrand() + ", Speed: " + getSpeed() + "km/h, Has Gear: " + hasGear);
	    }
	

}
