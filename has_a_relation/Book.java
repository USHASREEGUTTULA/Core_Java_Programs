package has_a_relation;

public class Book 
{
	private String bookname;
	private double price;
	private Author author;//OBJECT
	
	public Book (String bookname,double price,Author author)
	{
		if(Validation.validateBookName(bookname)&& Validation.validatePrice(price))
		{
			this.bookname=bookname;
			this.price=price;
			this.author=author;
		
		}
	}
	
	public double calculateDiscountPrice(int percentage)
	{
		
		double Discountprice=price-price*percentage/100;
		return Discountprice;
	}

	public void displayInfo()
	{
		System.out.println("Book name ="+this.bookname);
		System.out.println("Book Price ="+this.price);
		System.out.println("Book Discounted Price ="+this.calculateDiscountPrice(10));
		this.author.displayInfo();
	}
	
	
}
