package Constructors;

public class Vehicle 
{
	public String brand;
	public int maxSpeed;
	public String fuelType;

	public void start()
    {
        System.out.println(brand + " is starting.");
    }

	public void stop() 
    {
        System.out.println(brand + " is stopping.");
    }
}
