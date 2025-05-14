package inheritance_assignment;

public class MainClass3 
{

	    public static void main(String[] args) 
	    {
	        
	        MageWarrior m1=new MageWarrior();
	        
	        m1.initializeCharcter("Arthas", 90, 50);
	        m1.initializeWarrier("Sword", 5);
	        m1.initializeMageWarrior(70, 90);
	        
	       
	        m1.displayCharacterInfo();
	        
	        // Performing attack
	        int damage = m1.attack();
	        System.out.println(m1.name + " deals " + damage + " damage.");
	        
	        // Blocking attack
	        int reducedDamage = m1.blockAttack(40);
	        System.out.println(m1.name + " blocks the attack, reducing damage to: " + reducedDamage);
	        
	        // Upgrading weapon
	        String newWeapon = m1.upgradeWeapon("Magic Sword");
	        System.out.println(m1.name + " upgrades weapon to: " + newWeapon);
	        
	        // Casting spell
	        int remainingMana = m1.castSpell(30);
	        System.out.println(m1.name + " casts a spell, remaining mana: " + remainingMana);
	        
	        // Rechargingmana
	        int updatedMana = m1.rechargeMana(20);
	        System.out.println(m1.name + " recharges mana, new mana level: " + updatedMana);
	        
	        // Healing character
	        int updatedHealth = m1.heal(20);
	        System.out.println(m1.name + " heals, new health: " + updatedHealth);
	    
	        
	       

	       
	    }
}


	