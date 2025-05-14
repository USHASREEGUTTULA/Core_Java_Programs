package validation_assignment;

public class LaptopSpecificationsTracker
{
		public String brand;
	    public String processor;
	    public int ram;
	    public int storage;
	    public double batteryLife;
	    public int price;
	    
	    public int priceperGB;
	    public double processorScore;
	    public double performance;
	    public double batteryBackUp;
	    public int comparePrice;
	    public double hours;
	    
	    //validations
	    public boolean validBrand(String brand) 
		{
			if(brand.length()>3)
			{
				return true;
			}
			return false;
	    }
	    
	    public boolean validProcessor(String processor)
	    {
	    	if(processor.equals("i3") || processor.equals("i5") || processor.equals("i7") ||processor.equals("Ryzen 3") || processor.equals("Ryzen 5") || processor.equals("Ryzen 7"))
	    	{
	    		return true;
	    	}
	    	return false;
	    }
	    
	    public boolean validRam(int ram)
	    {
	    	if(ram>=4 && ram<=64)
	    	{
	    		return true;
	    	}
	    	return false;
	    }
	    
	    public boolean validStorage(int storage)
	    {
	    	if(storage>=128 && storage<=2000)
	    	{
	    		return true;
	    	}
	    	return false;
	    }
	    
	    public boolean validBatteryLife(int life)
	    {
	    	if(life>=3 && life<=12)
	    	{
	    		return true;
	    	}
	    	return false;
	    }
	    
	    public boolean validPrice(int price)
	    {
	    	if(price>=25000 && price<=300000)
	    	{
	    		return true;
	    	}
	    	return false;
	    }
	    //------------------------------------------------
	    //method to calculate price per gb
	    public int calPricePerGB()
	    {
	    	priceperGB=this.price/ram;
	    	return priceperGB;
	    }
	    //method to calculate performance index
	    public double performanceIndex()
	    {
	        performance= ram * processorScore;
	        return performance;
	    }
	    //doubt
	    //create a method to get "processor score" which is to be used during calculation of performance index
	    public double getProcessorScore(String processor) 
	    {
	        switch (processor) 
	        {
	            case "i3":
	            {
	            	return 1;
	            }
	            case "i5":
	            {
	            	return 2;
	            }
	            case "i7": 
	            	{
	            		return 3;
	            	}
	            case "Ryzen 3":
	            	{
	            		return 1;
	            	}
	            case "Ryzen 5":
	            	{
	            		return 2;
	            	}
	            case "Ryzen 7": 
	            	{
	            		return 3;
	            	}
	            default: 
	            	{
	            		return 0;
	            	}
	        }
	    }
	    
	   
	    
	    //method for backup
	    public double backup(double hours)
	    {
	    	batteryBackUp=this.batteryLife/hours;
	    	return batteryBackUp;
	    }
	    //doubt
	    //method to compare LaptopSpecificationsTracker price
	    public String comparePrice(LaptopSpecificationsTracker otherLaptop) 
	    {
	        if (this.price < otherLaptop.price) 
	        {
	        	return this.brand + " is cheaper than " + otherLaptop.brand;
	        } 
	        else if (this.price > otherLaptop.price)
	        {
	            return this.brand + " is more expensive than " + otherLaptop.brand;
	        }
	        else 
	        {
	            return "Both laptops are priced the same.";
	        }
	    }
	    //initialization
	    public void initialize(String brand, String processor, int ram, int storage, int batteryLife, int price,int hours)
	    {
	        if (validBrand(brand) && validProcessor(processor) && validRam(ram) && validStorage(storage)&& 
	        		validBatteryLife(batteryLife) && validPrice(price))
	        {
	            this.brand = brand;
	            this.processor = processor;
	            this.ram = ram;
	            this.storage = storage;
	            this.batteryLife = batteryLife;
	            this.price = price;
	            this.processorScore=getProcessorScore(processor);
	            this.priceperGB = calPricePerGB();
	            this.performance=performanceIndex();
	            this.batteryBackUp=backup(hours);
	        } 
	        else
	        {
	            System.err.println("Invalid input data! Please check the details.");
	        }
	    }
	    
	    public void displayInfo()
	    {
	        System.out.println("Laptop Brand: " +brand);
	        System.out.println("Laptop processor: " +processor);
	        System.out.println("Laptop RAM: " +ram+"GB");
	        System.out.println("Laptop Storage: " +storage + "GB");
	        System.out.println("Laptop BatteryLife: " +batteryLife + "hours");
	        System.out.println("Laptop Price: " +price);
	        System.out.println("Price per GB: " +priceperGB);
	        System.out.println("Laptop performance: " +performance);
	        System.out.println("Battery backup of laptop is : " +batteryBackUp);
	    }
	    
	    public static void main(String[] args) 
	    {
	    	LaptopSpecificationsTracker lap1=new LaptopSpecificationsTracker();
	    	LaptopSpecificationsTracker lap2=new LaptopSpecificationsTracker();
			
			lap1.initialize("DELL", "i7", 64, 256, 4, 100000,10);
			lap2.initialize("LENOVO", "i5", 32, 128, 6, 70000,12);
			
			lap1.displayInfo();
			lap2.displayInfo();
			
			System.out.println(lap1.comparePrice(lap2));
		}
}

