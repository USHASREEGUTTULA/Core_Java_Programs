package inheritance_assignment;

public class Car extends Vehicle
{
	public String fuelType;
	public double mileage;

	public boolean validateFuelType(String fuel)
	{
        if(fuel.equals("Petrol") || fuel.equals("Diesel") || fuel.equals("Electric"))
        {
			return true;
	   }
		return false;
    }

	public boolean validateMileage(double mileage) 
	{
        if(mileage >= 5)
        		 {
			return true;
	   }
		return false;
    }

	public void setCarDetails(String fuelType, double mileage)
	{
        if (validateFuelType(fuelType) && validateMileage(mileage)) 
        {
            this.fuelType = fuelType;
            this.mileage = mileage;
        }
        else 
        {
            System.out.println("Invalid car details");
        }
    }

	public double calculateFuelEfficiency(double distance, double fuelConsumed)
	{
        double efficiency=distance / fuelConsumed;
        return efficiency;
    }

	public void refuel(double amount) 
	{
        System.out.println("Refueled " + amount + " liters.");
    }

}
