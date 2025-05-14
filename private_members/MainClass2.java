package private_members;

public class MainClass2 
{
	public static void main(String[] args) 
	{
		ICICI_bank i= new ICICI_bank(2);
		i.getROI();
		
		SBI_bank s= new SBI_bank(5);
		s.getROI();
		
		HDFC_bank h= new HDFC_bank(4);
		h.getROI();
		
		
		
		
	}

}
