package Constructors;

public class Cat extends Animal 
{
	public String color;
	public boolean isIndoor;
	public String favoriteFood;

    // Constructor for Cat
	public  Cat(String name, int age, double weight, String color,
			boolean isIndoor, String favoriteFood)
	{
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.isIndoor = isIndoor;
        this.favoriteFood = favoriteFood;
    }

	public void meow()
	{
        System.out.println(name + " says Meow!");
    }

	public void scratch()
	{
        System.out.println(name + " is scratching the furniture!");
    }
}
