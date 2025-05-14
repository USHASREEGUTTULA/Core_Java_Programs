package validation_assignment;

public class BankAccountMangement
{
	    public String accountHolder;
	    public long accountNumber;
	    public int balance;
	    public String accountType;
	    public int annualinterest;
	    
	  
	    // Validation Methods
	    private boolean validateAccountHolder(String name) 
	    {
	       if(name.length() >= 3)
	       {
				return true;
		   }
			return false;
	    }

	    private boolean validateAccountNumber(long accountnumber) 
	    {
	    	
				int count=0;
				
				while(accountnumber!=0)
				{
					accountnumber=accountnumber/10;
					count++;
					
				}
				return count==10;
			}

	    private boolean validateBalance(int balance) 
	    {
	       if(balance >= 500 && balance <= 10000000)
	       {
				return true;
			}
			return false;
	    }

	    private boolean validateAccountType(String type) 
	    {
	       if(type.equals("Savings") || type.equals("Current"))
	       {
				return true;
			}
			return false;
	    }

	    // Methods
	    public double calculateInterest()
	    {
	       annualinterest=balance * 4/100; // 4% annual interest
	       return annualinterest;
	    }

	    public boolean withdraw(int amount)
	    {
	        if (amount > 0 && (balance - amount) >= 500) 
	        { 
	            balance -= amount;
	            return true;
	        }
	        return false;
	    }

	    public void deposit(int amount)
	    {
	        if (amount > 0)
	        {
	            balance += amount;
	        }
	    }

	    public boolean checkMinimumBalance() 
	    {
	        if(balance >= 500)
	        {
	        	return true;
	        }
	        return false;
	    }
	    
	    //initialize 
	    public void initialize(String accountHolder, long accountnumber, int balance, String accountType) 
	    {
	        if (validateAccountHolder(accountHolder) && validateAccountNumber(accountnumber) &&
	        		validateBalance(balance) && validateAccountType(accountType) ) 
	        {
	         this.accountHolder = accountHolder;
	         this.accountNumber = accountnumber;
	         this.balance = balance;
	         this.accountType = accountType;
	        }
	        
	        else
			{
				System.err.println("Invalid data");
			}
	    }

	    // Display Account Details
	    public void displayAccount()
	    {
	        System.out.println("Account Holder: " + accountHolder);
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Account Type: " + accountType);
	        System.out.println("Balance: ₹" + balance);
	    }

	    // Main method for testing
	    public static void main(String[] args)
	    {
	    	BankAccountMangement acc = new BankAccountMangement();

	    	acc.initialize("Likhitha", 1234567890L, 5000, "Savings");
	        acc.displayAccount();

	        System.out.println("Interest Earned: ₹" + acc.calculateInterest());
	        
	        System.out.println("Withdraw ₹1000: " + (acc.withdraw(1000) ? "Success" : "Failed"));
	        acc.displayAccount();

	        acc.deposit(2000);
	        System.out.println("After deposit of ₹2000:");
	        acc.displayAccount();

	        System.out.println("Minimum Balance Check: " + (acc.checkMinimumBalance() ? "Maintained" : "Low Balance"));
	    }
	}


