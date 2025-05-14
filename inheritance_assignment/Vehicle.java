package inheritance_assignment;

public class Vehicle
{
	public String brand;
	public String model;
	public int maxSpeed;
	public int currentSpeed = 0;

	public boolean validateBrand(String brand) 
    {
        if(brand.length() >= 2 )
       {
			return true;
	   }
		return false;
    }

	public boolean validateModel(String model) 
    {
        if(!model.isEmpty())
        {
			return true;
	   }
		return false;
    }

	public boolean validateMaxSpeed(int speed)
    {
        if(speed > 0 && speed <= 500)
        {
			return true;
	   }
		return false;
    }

	public void initialize(String brand, String model, int maxSpeed) 
    {
        if (validateBrand(brand) && validateModel(model) && validateMaxSpeed(maxSpeed)) 
        {
            this.brand = brand;
            this.model = model;
            this.maxSpeed = maxSpeed;
        }
        else
        {
            System.out.println("Invalid vehicle details");
        }
    }

	public void displayInfo()
    {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Max Speed: " + maxSpeed + " km/h");
    }

	public void accelerate(int speedIncrease)
    {
        if (currentSpeed + speedIncrease <= maxSpeed)
        {
            currentSpeed += speedIncrease;
            System.out.println("Accelerated. Current Speed: " + currentSpeed);
        } 
        else 
        {
            System.out.println("Cannot exceed max speed!");
        }
    }

}
