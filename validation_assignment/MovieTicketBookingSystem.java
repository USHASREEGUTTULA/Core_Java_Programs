package validation_assignment;

public class MovieTicketBookingSystem
{
	public char seatletter;
	public String moviename;
	public int ticketprice;
	public String seatnumber;
	public String theatername;
	public int totalcost;
	public int nooftickets;
	public int discount;

	public boolean validMovieName(String moviename) 
	{
		if(moviename.length()>=3)
			return true;
		else
			return false;
    }
	
	public boolean validTicketPrice(int price)
	{
		if(price>=100 && price<=1000)
			return true;
		else
			return false;
	}
	
	public boolean validTheaterName(String theatername)
	{
		if(theatername.length()>5)
			return true;
		else
			return false;
	}
	
	public int totalPrice(int nooftickets)
	{
		totalcost=ticketprice*nooftickets;
		return totalcost;
	}
	
	public int discountOnTicket()
	{
		if(nooftickets>5) 
		{
			discount=totalcost-totalcost*10/100;
			return discount;
		}
		else
			return 0;
	}
	
	public boolean seatletter(char seatletter)
	{
	    if (seatletter >= 65 && seatletter <= 90) 
	        return true;
	    else
	        return false;
	}
	

	public void initialize(String movieName, int ticketPrice, char seatletter,int seatNumber, String theaterName,int nooftickets)
	{
		if(validMovieName(movieName)&& validTicketPrice(ticketPrice)
				&& validTheaterName(theaterName))
		{
			this.moviename=movieName;
			this.ticketprice=ticketPrice;
			this.seatnumber=seatletter+String.valueOf(seatNumber);
		    this.theatername=theaterName;
		    this.nooftickets=nooftickets;
		    this.totalcost=totalPrice(nooftickets);
		    this.discount=discountOnTicket();
		}
	}
	
	public void display()
	{
		System.out.println("Movie name is: "+moviename);
		System.out.println("Ticket price is: "+ticketprice);
		System.out.println("Seat number is: "+seatnumber);
		System.out.println("Theater name is: "+theatername);
		System.out.println("total cost of tickets is: "+totalcost);
		System.out.println("Discount applied is: "+discount);
	}
	
	public static void main(String[] args) 
	{
		MovieTicketBookingSystem tic1=new MovieTicketBookingSystem();
		
		tic1.initialize("pushpa", 300, 'B', 7, "sandhyaTheatre", 6);
		
		tic1.display();
	}

	
}