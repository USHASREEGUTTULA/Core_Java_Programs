package inheritance_assignment;

public class Electronics extends Product
{
	    public int warrantyPeriod;
	    public int powerUsage;

	    // Validation Methods
	    public boolean validateWarranty(int warrantyPeriod) 
	    {
	        if (warrantyPeriod >= 6) 
	        {
	            return true;
	        }
	        return false;
	    }

	    public boolean validatePowerUsage(int powerUsage) 
	    {
	        if (powerUsage > 0 && powerUsage <= 5000) 
	        {
	            return true;
	        }
	        return false;
	    }

	    // Initialize Electronics
	    public void initializeElectronics(int warrantyPeriod, int powerUsage) 
	    {
	        if (validateWarranty(warrantyPeriod) && validatePowerUsage(powerUsage))
	        {
	            this.warrantyPeriod = warrantyPeriod;
	            this.powerUsage = powerUsage;
	        }
	        else 
	        {
	            System.out.println("Invalid electronics details!");
	        }
	    }

	    // Check Warranty
	    public String checkWarranty(String purchaseDate) 
	    {
	        String status = "Warranty Valid";
	        return status;
	    }

	    // Calculate Energy Cost
	    public double calculateEnergyCost(int hoursUsed) 
	    {
	        double cost = powerUsage * 0.1 * hoursUsed;
	        return cost;
	    }

	    // Display Electronics Details
	    public void displayElectronics() 
	    {
	        displayProduct();
	        System.out.println("Warranty Period: " + warrantyPeriod + " months");
	        System.out.println("Power Usage: " + powerUsage + " watts");
	    }
}
