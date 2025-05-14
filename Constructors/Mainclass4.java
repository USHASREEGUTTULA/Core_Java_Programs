package Constructors;

public class Mainclass4 
{
	public static void main(String[] args)
	{
        Phone p1 = new Phone("Samsung", 700, "Galaxy S21", 24);
        p1.turnOn();
        p1.makeCall();
        p1.turnOff();

        System.out.println();

        Laptop l1 = new Laptop("Dell", 1200, "Intel i7", 16);
        l1.turnOn();
        l1.connectToWiFi();
        l1.turnOff();
    }
}
