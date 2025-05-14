package private_members;

public class ICICI_bank extends Bank

{
	private int ROI_ICICI;
	
	public ICICI_bank(int ROI_ICICI)
	{
		this.ROI_ICICI=ROI_ICICI;
	}
	
	@Override
	public void getROI()
	{
		System.out.println("Rate of Interest of ICICI bank is : "+this.ROI_ICICI);
	}

	

}
