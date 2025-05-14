package inheritance_assignment;

public class MainClass6 
{
	 public static void main(String[] args) 
	 {
	        CEO ceo = new CEO();
	        
	        ceo.initializeEmployee("John", 500000, "Finance");
	        ceo.initializeManager(5, 2);
	        ceo.initializeCEO("TechCorp", 5000000);
	        
	      
	        ceo.work(8);
	        ceo.requestRaise(20000);
	        ceo.makeDecision("Expand Market", "High");
	        ceo.announceStrategy("Growth through Innovation");
	    }
}
