package inheritance_assignment;

public class Character 
{

	public String name;
	private int health;
	public int strength;

	 public boolean validateName(String name) 
	 {
	   if (name.length() >= 3) 
	    {
	          return true;
        }
        return false;
    }

	
	public boolean validatehealth(int health) 
	{
        if  (health >= 0 && health <= 100) 
        {
            return true;
        }
        return false;
    }

	public  boolean validateStrength(int strength) 
	{
        if (strength > 0) 
        {
            return true;
        }
        return false;
    }

	public void initializeCharcter(String name, int level, int strength) 
	{
        if (validateName(name) && validatehealth(health) && validateStrength(strength))
        {
            this.name = name;
            this.health = health;
            this.strength = strength;
        } 
        else 
        {
            System.out.println("Invalid character details");
        }
    }

	public void displayCharacterInfo() 
	{
        System.out.println("Name: " + name + ", Health: " + health + ", Strength: " + strength);
    }

	// Attack method
    public int attack()
    {
        int damage = strength;  
        return damage;
    }

    // Heal method
    public int heal(int amount)
    {
        if (amount > 0) 
        {
            int newHealth = health + amount;
            if (newHealth > 100)
            {
                newHealth = 100;
            }
            health = newHealth;
        }
        int updatedHealth = health;  
        return updatedHealth;
    }


	

    
}


