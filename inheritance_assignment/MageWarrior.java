package inheritance_assignment;

public class MageWarrior extends Warrior{
	
	
	    public int magicPower;
	    public int mana;

	    
	    public boolean validateMagicPower(int magicPower)
	    {
	        if (magicPower >= 5) 
	        {
	           return true;
	        }
	        return false;
	    }

	    
	    public boolean validateMana(int mana) 
	    {
	        if (mana >= 0 && mana <= 100)
	        {
	        	 return true;
	        }
	        return false;
	    }
  
	    public void initializeMageWarrior(int magicPower, int mana) 
		{
	        if (validateMagicPower(magicPower) && validateMana(mana))
	        {
	        	this.magicPower = magicPower;
	    	    this.mana = mana;
	        }
	        else 
	        {
	            System.out.println("Invalid character details");
	        }
	    }
	    
	    
	    // Cast spell method
	    public int castSpell(int power) 
	    {
	        if (mana >= power) 
	        {
	            mana -= power;
	        }
	        int remainingMana = mana;  
	        return remainingMana;
	    }

	    
	    public int rechargeMana(int amount) 
	    {
	        if (amount > 0) {
	            int newMana = mana + amount;
	            if (newMana > 100) {
	                newMana = 100;
	            }
	            mana = newMana;
	        }
	        int updatedMana = mana;  
	        return updatedMana;
	    }
	}



