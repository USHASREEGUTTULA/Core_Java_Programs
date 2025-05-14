package private_members;

public class SBI_bank extends Bank
{

	private int ROI_SBI;
	
	public SBI_bank(int ROI_SBI)
	{
		this.ROI_SBI=ROI_SBI;
	}
	
	@Override
	public void getROI()
	{
		System.out.println("Rate of Interest of SBI bank is : "+this.ROI_SBI);
	}

}
