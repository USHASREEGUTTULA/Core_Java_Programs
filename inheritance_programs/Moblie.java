package inheritance_programs;

public class Moblie 
{
	public String brand;
	public int storage;
    public int price;
    public double pricepergb;
    
    public double calculate_Price_Per_GB() 
    {
    	pricepergb=(double) price / storage;
    	return pricepergb;
    }
    

}
