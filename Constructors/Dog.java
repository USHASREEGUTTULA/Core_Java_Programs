package Constructors;

public class Dog extends Animal 
{
	
	public String breed;
	public boolean isTrained;
	public String color;

    // Constructor for Dog
	public Dog(String name, int age, double weight, 
			String breed, boolean isTrained, String color)
	{
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.breed = breed;
        this.isTrained = isTrained;
        this.color = color;
    }
	
	public void bark() 
	{
        System.out.println(name + " is barking!");
    }

	public void fetch() 
	{
        System.out.println(name + " is fetching the ball.");
    }
}
