package inheritance_assignment;

public class Product 
{
	public String name;
    public double price;
    public int stock;

    // Validation Methods
    public boolean validateName(String name) 
    {
        if (name.length() >= 3)
        {
            return true;
        }
        return false;
    }

    public boolean validatePrice(double price)
    {
        if (price >= 1)
        {
            return true;
        }
        return false;
    }

    public boolean validateStock(int stock)
    {
        if (stock >= 0)
        {
            return true;
        }
        return false;
    }

    // Initialize Method
    public void initializeProduct(String name, double price, int stock) 
    {
        if (validateName(name) && validatePrice(price) && validateStock(stock))
        {
            this.name = name;
            this.price = price;
            this.stock = stock;
        } 
        else
        {
            System.out.println("Invalid product details!");
        }
    }

    // Calculate Discount
    public double calculateDiscount(double discountPercentage) 
    {
        double discountAmount = price * (discountPercentage / 100);
        double finalPrice = price - discountAmount;
        return finalPrice;
    }

   
    public int restock(int amount)
    {
        stock += amount;
        int updatedStock = stock;
        return updatedStock;
    }

    // Display Product Information
    public void displayProduct() 
    {
        System.out.println("Product Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Stock Available: " + stock);
    }
}
