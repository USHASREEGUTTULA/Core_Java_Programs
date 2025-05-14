package inheritance_assignment;

public class AppleTree extends FruitTree
{
	public String variety;
    public int sweetnessLevel;

    public boolean validateVariety(String variety) 
    {
        if (variety.length() >= 3)
        {
            return true;
        }
        return false;
    }

    public boolean validateSweetnessLevel(int sweetnessLevel) 
    {
        if (sweetnessLevel >= 1 && sweetnessLevel <= 10) 
        {
            return true;
        }
        return false;
    }

    public void initializeAppleTree(String variety, int sweetnessLevel) 
    {
        if (validateVariety(variety) && validateSweetnessLevel(sweetnessLevel)) 
        {
            this.variety = variety;
            this.sweetnessLevel = sweetnessLevel;
        } 
        else
        {
            System.out.println("Invalid apple tree details");
        }
    }

    public int calculateSugarContent(int weight)
    {
        int sugarContent = weight * sweetnessLevel;
        return sugarContent;
    }

    public int harvestApples()
    {
        int applesHarvested = harvestTime * 10;
        return applesHarvested;
    }
}
