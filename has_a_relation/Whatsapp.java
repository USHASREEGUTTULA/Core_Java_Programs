package has_a_relation;

public class Whatsapp
{
	private long mobilenum;
	private String name;
	private String email;
	private Image image;
	
	public Whatsapp (long mobilenum,String name,String email,Image image)
	{
		if(Validation2.validateName(name)&&Validation2.validateMobileNum(mobilenum)&& Validation2.validateEmail(email))
		{
			this.mobilenum=mobilenum;
			this.name=name;
			this.email=email;
			this.image=image;
		
		}
	}
	public void generateChat() 
	{
		System.out.println("Hii Guys chatting");
	}
	
	public void generateVideoCall() 
	{
		System.out.println("Hii Guys calling");
	}
	
	public void displayInfo()
	{
		System.out.println("Mobile Num ="+this.mobilenum);
		System.out.println("Name ="+this.name);
		System.out.println("Email ="+this.email);
		this.image.displayInfo();
	}
	

}
