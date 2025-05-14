package validation_assignment;

public class AirConditionerDetails
{
	    public String brand;
	    public float capacity;
	    public int powerUsage;
	    public int price;
	    public int energyRating;
	    
	    public int annualConsumption;
	    public int operatingCost;
	    public int hours;
	    public int electricityRate;
	    
	    // Validation methods
	    private boolean validateBrand (String brand) 
	    {
	       
	        if (brand.length() >= 3)
			{
				return true;
			}
			return false;
	    }

	    private boolean validateCapacity(float capacity) 
	    {
	        if (capacity >= 1.0 && capacity <= 5.0)
			{
				return true;
			}
			return false;
	    }

	    private boolean validatePowerUsage(int powerUsage)
	    {
	        
	        if (powerUsage >= 500 && powerUsage <= 3000)
			{
				return true;
			}
			return false;
	    }

	    private boolean validatePrice(int price) 
	    {
	      
	        if (price >= 20000 && price <= 100000)
			{
				return true;
			}
			return false;
	    }

	    private boolean validateEnergyRating(int energyRating)
	    {
	     
	        if (energyRating >= 1 && energyRating <= 5)
			{
				return true;
			}
			return false;
	    }

	    // Methods
	    public int calculateAnnualConsumption() 
	    {
	    	annualConsumption =powerUsage * 8 * 365; // Assuming 8 hours of usage per day
	    	return annualConsumption;
	    }

	    public double calculateOperatingCost(int hours, int electricityRate)
	    {
	    	operatingCost=((powerUsage / 1000) * hours * electricityRate); // Cost per kWh
	    	return operatingCost;
	    }

	    public String compareEfficiency(AirConditionerDetails AC2) 
	    {
	        if (this.energyRating > AC2.energyRating) 
	        {
	        	return this.brand + " is more efficient";
	        }
	        else if (this.energyRating < AC2.energyRating) 
	        {
	        	return AC2.brand + " is more efficient";
	        }
	        else 
	        	{
	        	return "Both ACs have the same efficiency rating";
	        	}
	    }
	    //doubt
	    public static AirConditionerDetails suggestBestModel(AirConditionerDetails[] models)
	    {
	        AirConditionerDetails bestModel = models[0];
	        for (AirConditionerDetails ac : models) 
	        {
	            if (ac.energyRating > bestModel.energyRating) 
	            {
	                bestModel = ac;
	            }
	        }
	        return bestModel;
	    }

	 // initialize 
	    public void initialize (String brand, float capacity, int powerUsage, int price, int energyRating) 
	    {
	        if (validateBrand(brand) && validateCapacity(capacity) && validatePowerUsage(powerUsage)
	        		&& validatePrice(price) && validateEnergyRating(energyRating))
	        {
	        this.brand = brand;
	        this.capacity = capacity;
	        this.powerUsage = powerUsage;
	      	this.price = price;
	        this.energyRating = energyRating;
	        }
	        else
	        {
	            System.err.println("Invalid input data! Please check the details.");
	        }
	    }

	 // Display method
	    public void displayInfo()
	    {
	        System.out.println("AC Brand: " + this.brand);
	        System.out.println("AC Capacity: " + this.capacity);
	        System.out.println("AC powerUsage: " + this.powerUsage + "W");
	        System.out.println("AC Price: " + this.price);
	        System.out.println("AC EnergyRating: " + this.energyRating+"stars");
	       
	    }
	    // Main method to test the class
	    public static void main(String[] args)
	    {
	    	AirConditionerDetails AC1 = new AirConditionerDetails();
	    	AirConditionerDetails AC2 = new AirConditionerDetails();
	    	
	    	AC1.initialize("Bluestar", 1.5f, 1200, 45000, 4);
	    	AC2.initialize("Samsung", 2.0f, 1500, 55000, 5);
	    	
	    	AC1.displayInfo();
	    	AC2.displayInfo();
	    	

	       System.out.println(AC1.compareEfficiency(AC2));

	    }
	}


