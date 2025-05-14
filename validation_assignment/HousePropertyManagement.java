package validation_assignment;

public class HousePropertyManagement
{

	    public String location;
	    public int area;
	    public long price;
	    public int bedrooms;
	    public int bathrooms;
	    public long calpricepersqft;
	    public int luxuryindex;
	    public boolean affordable;
	    public long budget;
	    
	    public boolean validateLocation(String location)
	    {
	        if (location.length()>=5) 
	        {
	        	return true;
            }
            return false;
	    }
	    
	    public boolean validateArea(int area) 
	    {
	        if (area>=500 && area<=10000)
	        {
	        	return true;
            }
            return false;
	    }
	    
	    public boolean validatePrice(long price)
	    {
	        if (price>=500000 && price<=50000000)
            {
	        	return true;
            }
            return false;       
	    }

	    public boolean validateRooms(int rooms) 
        {
	    	if (rooms>=1 || rooms<= 10) 
             {
	        	return true;
             }
             return false;
        }
	    
	   public long calculatePricePerSqft()
	   {
		   calpricepersqft=price /area;
		   return calpricepersqft;
	   }
	   
	   public int calculateLuxuryIndex()
	   {
		   luxuryindex=bedrooms +bathrooms;
		   return luxuryindex;
	   }

	   public String comparePrice(HousePropertyManagement otherHouse)
	   {
		   if (price > otherHouse.price)
		   {
			   return "This house1 is more expensive than the otherHouse.";
		   }
		   else if (price < otherHouse.price) 
		   {
	    	   return "This house is cheaper than the otherHouse.";
		   }
		   else 
		   {
	    	   return "Both houses have the same price.";
		   }
	   }

	   public boolean checkAffordability(long budget) 
	   {
		   if(affordable=budget>=price)
		   {
			   return true;
		   }
		   return false;
	   }
     
	   //initialization
	    public void initialize(String location, int area, long price, int bedrooms, int bathrooms,long budget)
	    {
	    	if(validateLocation(location)&& validateArea(area)&& validatePrice(price)&& validateRooms(bedrooms)&& validateRooms(bathrooms))
	    	{
		        this.location = location;
		        this.area = area;
		        this.price = price;
		        this.bedrooms = bedrooms;
		        this.bathrooms = bathrooms;
		        this.calpricepersqft=calculatePricePerSqft();
		        this.luxuryindex=calculateLuxuryIndex();
		        this.affordable=checkAffordability(budget);  
	    	}
	    }
	    
	    //display
	    public void displayInfo() 
	    {
	    	System.out.println("The house location is: "+location);
	    	System.out.println("The house area is: "+area);
	    	System.out.println("The price of the house is: "+price);
	    	System.out.println("number of bedrooms : "+bedrooms);
	    	System.out.println("number of bathrooms : "+bathrooms);
	    	System.out.println("Price per sqft of house is: " +calpricepersqft);
	        System.out.println("Luxury index of house is: " +luxuryindex);
	        System.out.println("Is house affordable with budget: "+affordable);
	        
	        
	    }
		    public static void main(String[] args)
		    {
	      
		    	HousePropertyManagement house1 = new HousePropertyManagement();
		    	HousePropertyManagement house2 = new HousePropertyManagement();
		    	
		    	house1.initialize("Hyderabad", 2000, 10000000L, 3, 2,2000000L);
		    	house2.initialize("Jagtial", 2500, 15000000L, 4, 3,3000000L);
		    	
		    	house1.displayInfo();
		    	house2.displayInfo();
		    	
		    	System.out.println(house1.comparePrice(house2));
            }
}