package inheritance_assignment;

public class MainClass4 
{
	public static void main(String[] args)
	{
        AppleTree appleTree = new AppleTree();
        
        appleTree.initializePlant("Mango", 8);
        appleTree.initializeFruitTree("Apple", 3);
        appleTree.initializeAppleTree("Honeycrisp", 7);
        
        appleTree.displayPlantInfo();
        System.out.println("Energy produced: " + appleTree.photosynthesis(5));
        
        appleTree.waterPlant(2);
        System.out.println("Fruits produced: " + appleTree.bearFruit("Spring"));
        
        appleTree.pruneTree();
        System.out.println("Sugar content: " + appleTree.calculateSugarContent(5));
        
        System.out.println("Apples harvested: " + appleTree.harvestApples());
    }
}
