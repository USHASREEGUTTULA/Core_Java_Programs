package inheritance_assignment;

public class FruitTree extends Plant
{
	public String fruitType;
    public int harvestTime;

    public boolean validateFruitType(String fruitType) 
    {
        if (fruitType.length() >= 3 )
        {
            return true;
        }
        return false;
    }

    public boolean validateHarvestTime(int harvestTime) 
    {
        if (harvestTime >= 1) 
        {
            return true;
        }
        return false;
    }

    public void initializeFruitTree(String fruitType, int harvestTime)
    {
        if (validateFruitType(fruitType) && validateHarvestTime(harvestTime))
        {
            this.fruitType = fruitType;
            this.harvestTime = harvestTime;
        } 
        else 
        {
            System.out.println("Invalid fruit tree details");
        }
    }

    public int bearFruit(String season)
    {
        int fruitYield = harvestTime * 5;
        return fruitYield;
    }

    public void pruneTree() 
    {
        System.out.println("Tree has been pruned.");
    }
}
