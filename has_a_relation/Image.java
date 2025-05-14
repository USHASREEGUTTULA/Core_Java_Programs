package has_a_relation;

public class Image 
{
	private String type;
	private int size;
	private int resolution;

	public Image (String type,int size,int resolution)
	{
		if(Validation2.validateType(type)&&Validation2.validateSize(size)&& Validation2.validateResolution(resolution))
		{
			this.type=type;
			this.size=size;
			this.resolution=resolution;
	
		}
	}
	
	public void displayInfo()
	{
		System.out.println("Type="+this.type);
		System.out.println("Size ="+this.size);
		System.out.println("Resolution ="+this.resolution);
		
	}
	
}
