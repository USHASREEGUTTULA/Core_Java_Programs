package inheritance_programs;

public class BankAccount2 extends BankAccount
{
   public void initialize(String accHolder,long accNum,String accType,int balance)
   {
	   this.accHolder=accHolder;
	   this.accNum=accNum;
	   this.accType=accType;
	   this.balance=balance;
   }
   
   public void displayinfo()
   {
	   System.out.println("Account Holder is : "+accHolder);
	   System.out.println("Account Number is : "+accNum);
	   System.out.println("Account Type is : "+accType);
	   System.out.println("Account Balance is : "+balance);
	  
	   
   }
   
}
