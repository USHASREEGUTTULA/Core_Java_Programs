package inheritance_programs;

public class BankAccount 
{
	public String accHolder;
	public long accNum;
	public String accType;
	public int balance;
	
	public int deposit(int amount)
	{
		if(amount>0)
		{
			balance+=amount;
			System.out.println("Account Balance after deposit is : "+balance);
		}
		return balance; 
		
	}
	
	public boolean checkminBal()
	{
		if(balance>=500)
		{
			return true;
		}
		return false;
	}

}
