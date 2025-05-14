package inheritance_assignment;

public class Surgeon extends Doctor
{
	 public String surgeryType;
	   public double successRate;
	    
	    public boolean validateSurgeryType(String surgeryType) 
	    {
	        if (surgeryType.length()>=3) {
	            return true;
	        }
	        return false;
	    }
	    
	    public boolean validateSuccessRate(double successRate) 
	    {
	        if (successRate >= 0 && successRate <= 100)
	        {
	            return true;
	        }
	        return false;
	    }
	    
	    public void performSurgery(String patientName)
	    {
	        System.out.println(name + " is performing " + surgeryType + " on patient " + patientName + ".");
	    }
	    
	    public void updateSuccessRate(double newSuccessRate) 
	    {
	        if (validateSuccessRate(newSuccessRate)) 
	        {
	            this.successRate = newSuccessRate;
	            System.out.println("Success rate updated to: " + successRate + "%");
	        } 
	        else 
	        {
	            System.out.println("Invalid success rate");
	        }
	    }
	    
	    public void initializeSurgeon(String surgeryType, double successRate)
	    {
	        if (validateSurgeryType(surgeryType) && validateSuccessRate(successRate))
	        {
	            this.surgeryType = surgeryType;
	            this.successRate = successRate;
	        } 
	        else
	        {
	            System.out.println("Invalid surgeon details");
	        }
	    }
	    
	    public void displaySurgeonInfo() 
	    {
	    	displayDoctorInfo();
	        System.out.println("Surgery Type: " + surgeryType + ", Success Rate: " + successRate + "%");
	    }
	    
}
