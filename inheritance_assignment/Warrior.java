package inheritance_assignment;
	
	public class Warrior extends Character
	{
public String weaponType;
public int defenseLevel;

    // Method to set weapon type with validation
    public boolean validateWeaponType(String weaponType)
    {
        if (weaponType.equals("Sword") || weaponType.equals("Axe") || weaponType.equals("Bow"))
        {
           return true;
        }
        return false;
    }

    // Method to set defense level with validation
    public boolean validateDefenseLevel(int defenseLevel) 
    {
        if (defenseLevel >= 1 && defenseLevel <= 10) 
        {
        	return true;
        }
        return false;        
    }
    
    public void initializeWarrier(String weaponType, int defenseLevel) 
	{
        if (validateWeaponType(weaponType) && validateDefenseLevel(defenseLevel))
        {
        	this.weaponType = weaponType;
		    this.defenseLevel = defenseLevel;
        }
        else 
        {
            System.out.println("Invalid character details");
        }
    }
    
    

    // Block attack method
    public int blockAttack(int damage) 
    {
        int reducedDamage = damage - defenseLevel;
        if (reducedDamage < 0) 
        {
            reducedDamage = 0;
        }
        return reducedDamage;
    }

    // Upgrade weapon method
    public String upgradeWeapon(String newWeapon) 
    {
        validateWeaponType(newWeapon);
        String updatedWeapon = weaponType;  
        return updatedWeapon;
    }
}


		
		


