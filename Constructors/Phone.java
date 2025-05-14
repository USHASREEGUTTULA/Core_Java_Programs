package Constructors;

public class Phone extends ElectronicDevice 
{
	public String model;
	public int batteryLife;

	public Phone(String brand, double price, String model, int batteryLife) 
	{
        this.brand = brand;
        this.price = price;
        this.model = model;
        this.batteryLife = batteryLife;
    }

	public void makeCall()
	{
        System.out.println(brand + " " + model + " is making a call.");
    }
}