package Constructors;

public class Laptop extends ElectronicDevice
{
	public String processor;
	public int ramSize;

	public Laptop(String brand, double price, String processor, int ramSize) 
	{
        this.brand = brand;
        this.price = price;
        this.processor = processor;
        this.ramSize = ramSize;
    }

	public  void connectToWiFi() 
	{
        System.out.println(brand + " laptop is connecting to WiFi.");
    }
}
