package inheritance_programs;

public class Car extends Vehicle
{
    public int maxCapacity;
	public int maxSpeed;
	public void openDoors()
	{
		System.out.println(this.name+"doors are opening");
	}
	
	@Override
	public  void start()
	{
		System.out.println(this.name+"is started");
	}
	@Override
	public void stop()
	{
		System.out.println(this.name+"is stopped");
	}
}
	


