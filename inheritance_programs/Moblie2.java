package inheritance_programs;

public class Moblie2 extends Moblie
{
	public void initialize(String brand, int storage, int price)
    {
		this.brand = brand;
       
        this.storage = storage;
       
        this.price = price;
        
        this.pricepergb = calculate_Price_Per_GB();
    }
	 public void displayInfo()
	    {
	        System.out.println("Mobile Brand: " + this.brand);
	       
	        System.out.println("Mobile Storage: " + this.storage + "GB");
	       
	        System.out.println("Mobile Price: " + this.price);
	        System.out.println("Price per GB: " + this.pricepergb);
	    }
}
