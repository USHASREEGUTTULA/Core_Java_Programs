package Constructors;

public class Aadhar 
{
	private long an;
	private String address;
	
	public Aadhar(long an,String address)
	{
		this.an=an;
		this.address=address;
	}
	
	//getters
	public long getan()
	{
		return this.an;
	}
	
	public String getaddress()
	{
		return this.address;
	}
	
	//setters
	public void setaddress(String address)
	{
		this.address=address;
	}
	
	//Main method
	public static void main(String[] args) 
	{
		Aadhar aadhar1=new Aadhar(68606610,"Hyd");
		System.out.println(aadhar1.getan());
		System.out.println(aadhar1.getaddress());
		
		aadhar1.setaddress("Chennai");
		System.out.println(aadhar1.getan());
		System.out.println(aadhar1.getaddress());
		
		
	}

}
