package inheritance_assignment;

public class Person 
{
	public String name;
    public int age;
    
    public boolean validateName(String name)
    {
        if (name.length() >= 3 )
        {
            return true;
        }
        return false;
    }
    
    public boolean validateAge(int age)
    {
        if (age >= 0 && age <= 120)
        {
            return true;
        }
        return false;
    }
    
    public void initializePerson(String name, int age) 
    {
        if (validateName(name) && validateAge(age)) 
        {
            this.name = name;
            this.age = age;
        } 
        else 
        {
            System.out.println("Invalid person details");
        }
    }
    
    public void displayPersonInfo() 
    {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    
    public void updateAge(int newAge) 
    {
        if (validateAge(newAge))
        {
            age = newAge;
            System.out.println("Age updated to: " + age);
        }
        else 
        {
            System.out.println("Invalid age");
        }
    }
}
