package oops_program;

public class MainClass 
{
	public static void main(String[] args) 
    {
        
		// Creating Car Object
        Car car1 = new Car("Toyota", 180);
        Car car2 = new Car("Honda", 160, 2);

        // Creating Bike Object
        Bike bike1 = new Bike("Yamaha", 120, true);
        Bike bike2 = new Bike("Royal Enfield", 100, false);

        // Calling methods - Demonstrating Polymorphism
        car1.displayDetails();
        car2.displayDetails();
        
        bike1.displayDetails();
        bike2.displayDetails();
        
        
        Vehicle v=AutoMobiles.generate();
        v.displayDetails();
    }

}
