package validation_assignment;

public class MobilePhoneSpecifications
{
    public String brand;
    public String model;
    public int ram;
    public int storage;
    public int batteryCapacity;
    public int price;
    
    public double pricepergb;
    public double backuptime;
    public int rating;
    public double hours;

    // Validation methods
    private boolean validateBrand(String brand)
    {
    	if (brand.length() >= 3)
		{
			return true;
		}
		return false;
		 
    }

    private boolean validateModel(String model) {
        if(model.length() >= 2)
        {
			return true;
		}
		return false;
    }

    private boolean validateRam(int ram) {
       if( ram >= 2 && ram <= 16)
        {
			return true;
		}
		return false;
    }

    private boolean validateStorage(int storage) 
    {
        if( storage >= 32 && storage <= 512)
        {
			return true;
		}
		return false;
    }

    private boolean validateBatteryCapacity(int batteryCapacity)
    {
       if(batteryCapacity >= 2000 && batteryCapacity <= 6000)
        {
			return true;
		}
		return false;
    }

    private boolean validatePrice(int price) 
    {
       if (price >= 5000 && price <= 20000)
       {
			return true;
       }
		return false;
    }

    // Methods
    public double calculate_Price_Per_GB() 
    {
    	pricepergb=(double) price / storage;
    	return pricepergb;
    }

    public double battery_Backup(double hours) 
    {
        	backuptime=  batteryCapacity / hours;
        	return backuptime;
      
    }

    public int performanceRating()
    {
        rating=(ram * storage) / 1000;
        return rating;
        
    }

    public String compare_Price(MobilePhoneSpecifications m2) 
    {
        if (this.price < m2.price) 
        {
            return this.brand + " " + this.model + " is cheaper.";
        } 
        else if (this.price > m2.price) 
        {
            return m2.brand + " " + m2.model + " is cheaper.";
        } 
        else
        {
            return "Both phones have the same price.";
        }
    }

    // Initialize method
    public void initialize(String brand, String model, int ram, int storage, int batteryCapacity, int price, double hours)
    {
        if (validateBrand(brand) && validateModel(model) && validateRam(ram) && validateStorage(storage)
                && validateBatteryCapacity(batteryCapacity) && validatePrice(price)) {
            this.brand = brand;
            this.model = model;
            this.ram = ram;
            this.storage = storage;
            this.batteryCapacity = batteryCapacity;
            this.price = price;
            this.pricepergb = calculate_Price_Per_GB();
            this.backuptime = battery_Backup(hours);
            this.rating = performanceRating();
        } 
        else
        {
            System.err.println("Invalid input data! Please check the details.");
        }
    }

    // Display method
    public void displayInfo()
    {
        System.out.println("Mobile Brand: " + this.brand);
        System.out.println("Mobile Model: " + this.model);
        System.out.println("Mobile RAM: " + this.ram + "GB");
        System.out.println("Mobile Storage: " + this.storage + "GB");
        System.out.println("Mobile Battery Capacity: " + this.batteryCapacity + "mAh");
        System.out.println("Mobile Price: " + this.price);
        System.out.println("Price per GB: " + this.pricepergb);
        System.out.println("Battery Backup Time: " +battery_Backup(10) + " hours");
        System.out.println("Performance Rating: " + this.rating);
    }

    // Main method to test the class
    public static void main(String[] args)
    {
        MobilePhoneSpecifications m1 = new MobilePhoneSpecifications();
        MobilePhoneSpecifications m2 = new MobilePhoneSpecifications();

        m1.initialize("Vivo", "Y51", 8, 256, 4000, 15000, 10);
        m2.initialize("Oppo", "Y21", 6, 128, 4500, 18000, 12);

        m1.displayInfo();
        m2.displayInfo();

        System.out.println(m1.compare_Price(m2));
    }
}
