package inheritance_programs;

public class Mainclass
{
    public static void main(String[] args) 
    {
		BankAccount2 b1=new BankAccount2();
		
		b1.initialize("Usha Sree", 43015711, "Savings", 1000);
		b1.displayinfo();
		b1.deposit(60);
		b1.checkminBal();
	}
}
