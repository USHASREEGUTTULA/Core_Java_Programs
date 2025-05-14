package Constructors;

public class Bike extends Vehicle 
{
	public boolean hasGear;
	public String type;

	public Bike(String brand, int maxSpeed, String fuelType, 
			boolean hasGear, String type)
	{
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
        this.hasGear = hasGear;
        this.type = type;
    }

	public void speedUp()
	{
        System.out.println(brand + " bike is speeding up.");
    }
}