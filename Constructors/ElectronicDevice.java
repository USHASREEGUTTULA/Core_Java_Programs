package Constructors;

public class ElectronicDevice 
{
	public String brand;
	public double price;
	public boolean isOn;

	public void turnOn() {
        isOn = true;
        System.out.println(brand + " device is turning on.");
    }

	public void turnOff() {
        isOn = false;
        System.out.println(brand + " device is turning off.");
    }
}
