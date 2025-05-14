package Constructors;

public class Mainclass2 
{
	public static void main(String[] args) 
	{
        Car c1 = new Car("Toyota", 180, "Petrol", 4, true);
        c1.start();
        c1.honk();
        c1.stop();

        System.out.println();

        Bike b1 = new Bike("Yamaha", 150, "Petrol", true, "Sports");
        b1.start();
        b1.speedUp();
        b1.stop();
    }

}
