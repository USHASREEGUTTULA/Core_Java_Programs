package Constructors;

public class Car extends Vehicle 
{
	public int doors;
	public boolean hasSunroof;

	public  Car(String brand, int maxSpeed, String fuelType, int doors, boolean hasSunroof) 
	{
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
        this.doors = doors;
        this.hasSunroof = hasSunroof;
    }

	public void honk()
	{
        System.out.println(brand + " car is honking.");
    }
}
