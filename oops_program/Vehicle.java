package oops_program;

// Abstraction: Abstract class Vehicle
	abstract class Vehicle 
	{
	    private String brand;
	    private int speed;

	    // Constructor
	    public Vehicle(String brand, int speed)
	    {
	        this.brand = brand;
	        this.speed = speed;
	    }

	    public Vehicle() {
			
		}

		// Encapsulation: Getters & Setters
	    public String getBrand() {
	        return brand;
	    }

	    public int getSpeed() {
	        return speed;
	    }

	    public void setSpeed(int speed) {
	        this.speed = speed;
	    }

	    // Abstract Method - Must be implemented by subclasses
	    public abstract void displayDetails();
	}

	
