package validation_assignment;

public class ECommerceProductManagement
{
	
	public String name;
	public String category;
	public int price;
	public int stockQuantity;
	public int discount;
	public double finalprice;
	public int totalstock;


	    // Validation methods
	    public boolean isValidateName(String name) 
	    {
	       if ( name.length() >= 3)
	       {
				return true;
	       }
			return false;
	    }

	    public boolean isValidateCategory(String category)
	    {
	        if( category.equals("Electronics") || category.equals("Clothing") ||
	               category.equals("Home Appliance") || category.equals("Books"))
	        {
				return true;
			}
			return false;
	    }

	    public boolean isValidatePrice(int price) 
	    {
	       if(price >= 50 && price <= 100000)
	       {
				return true;
			}
			return false;
	    }

	    public boolean isValidateStockQuantity(int stockQuantity)
	    {
	        if( stockQuantity > 0)
	        {
				return true;
			}
			return false;
	    }

	    public boolean isValidateDiscount(int discount)
	    { 
	    	if(discount >= 0 && discount <= 50)
	        {
				return true;
			}
			return false;
	    }

	    // Methods
	    public double calculateFinalPrice()
	    {
	       finalprice=price - (price * discount / 100.0);
	       return finalprice;
	    }

	    public int totalStockValue()
	    {
	        totalstock= price * stockQuantity;
	        return totalstock;
	    }

	    public boolean isInStock() 
	    {
	        if(stockQuantity > 0)
	        {
				return true;
			}
			return false;
	    }

	    public double applyBulkDiscount(int quantity) 
	    {
	        if (quantity > 10) 
	        {
	            return calculateFinalPrice() * 90/100; // Additional 10% discount on bulk purchase
	        }
	        return calculateFinalPrice();
	    }

	  //initialize 
	    public void initialize (String name, String category, int price, int stockQuantity, int discount) 
	    {
	        if(isValidateName(name) && isValidateCategory(category) && isValidatePrice(price) && 
	        		isValidateStockQuantity(stockQuantity) && isValidateDiscount(discount) ) 
	        {
	        	
		        this.name = name;
		        this.category = category;
		        this.price = price;
		        this.stockQuantity = stockQuantity;
		        this.discount = discount;
		        this.finalprice=calculateFinalPrice();
		        this.totalstock=totalStockValue();
	       
	        }
	        else
	        {
	            System.err.println("Invalid input data! Please check the details.");
	        }
	    }
	    // Display Product Details
	    public void displayProductDetails() 
	    {
	        System.out.println("Product Name: " + this.name);
	        System.out.println("Category: " + this. category);
	        System.out.println("Price: $" + this.price);
	        System.out.println("Stock Quantity: " + this.stockQuantity);
	        System.out.println("Discount: " + this.discount + "%");
	        System.out.println("FinalPrice :"+this.finalprice);
	        System.out.println("TotalStock:"+this.totalstock);
	        
	    }
	    
	    //Main class
	    
	    public static void main(String[] args) 
	    {
	    	
	    	ECommerceProductManagement e1=new ECommerceProductManagement();
	    	
	    	e1.initialize("Television", "Electronics", 20000, 2, 10);
	    	
	    	e1.displayProductDetails();
	    	
			
		}
	    
}

