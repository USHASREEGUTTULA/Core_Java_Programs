package inheritance_assignment;

public class Plant
{
	public String species;
    public int growthRate;

    public boolean validateSpecies(String species) 
    {
        if (species.length() >= 3 ) 
        {
            return true;
        }
        return false;
    }

    public boolean validateGrowthRate(int growthRate)
    {
        if (growthRate > 0 && growthRate <= 10) 
        {
            return true;
        }
        return false;
    }

    public void initializePlant(String species, int growthRate) 
    {
        if (validateSpecies(species) && validateGrowthRate(growthRate))
        {
            this.species = species;
            this.growthRate = growthRate;
        }
        else 
        {
            System.out.println("Invalid plant details");
        }
    }

    public void displayPlantInfo()
    {
        System.out.println("Species: " + species + ", Growth Rate: " + growthRate);
    }

    public int photosynthesis(int duration)
    {
        int energyProduced = duration * growthRate;
        return energyProduced;
    }

    public void waterPlant(int amount) 
    {
        System.out.println("Watered plant with " + amount + " liters.");
    }
}


