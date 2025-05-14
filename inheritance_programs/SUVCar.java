package inheritance_programs;

public class SUVCar extends Car
{
 public static String carType="SUV";
 public boolean isSunRoofAvailabvle;
 
 public void initialize(String name, double price, int maxCapacity,int maxSpeed,boolean isSunRoofAvailabvle)
 {
	 this.name = name;
    
     this.price = price;
    
     this.maxCapacity = maxCapacity;
     
     this.maxSpeed = maxSpeed;
     
     this.isSunRoofAvailabvle = isSunRoofAvailabvle;
 }
	 public void displayInfo()
	    {
	        System.out.println("Car Name: " + this.name);
	        System.out.println("Car Price: " + this.price);
	        System.out.println("Car MaxCapacity: " + this.maxCapacity );
	        System.out.println("Car MaxSpeed : " + this.maxSpeed);
	    }
}
