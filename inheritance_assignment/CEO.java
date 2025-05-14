package inheritance_assignment;

public class CEO extends Manager
{
	 public String companyName;
	    public double netWorth;

	    public boolean validateCompanyName(String companyName)
	    {
	        if(companyName.length() >= 3 )
	        		{
	            return true;
	        }
	        return false;
	    }

	    public boolean validateNetWorth(double netWorth)
	    {
	        if(netWorth >= 1_000_000)
	        		{
	            return true;
	        }
	        return false;
	    }

	    public void initializeCEO(String companyName, double netWorth) 
	    {
	        if (validateCompanyName(companyName) && validateNetWorth(netWorth))
	        {
	            this.companyName = companyName;
	            this.netWorth = netWorth;
	        } 
	        else 
	        {
	            System.out.println("Invalid CEO Details");
	        }
	    }

	    public void makeDecision(String decisionType, String impactLevel) 
	    {
	        System.out.println("CEO Decision: " + decisionType + " with impact level: " + impactLevel);
	    }

	    public void announceStrategy(String strategy)
	    {
	        System.out.println("CEO announces strategy: " + strategy);
	    }
}
