package private_members;

public class HDFC_bank extends Bank
{
private int ROI_HDFC;
	
	public HDFC_bank(int ROI_HDFC)
	{
		this.ROI_HDFC=ROI_HDFC;
	}
	
	@Override
	public void getROI()
	{
		System.out.println("Rate of Interest of HDFC bank is : "+this.ROI_HDFC);
	}

}
