package Assignment;

class InsufficientAmountException extends Exception
{
	double amt;
	public InsufficientAmountException(double amt)
	{
		this.amt=amt;
	}
	
	public void message()
	{
		System.out.println("Sorry, insufficient balance, you need more "+amt);
	}
}

class Bank
{
	double balance;
	public void getBalance()
	{
		System.out.println("Current Balance is : "+ balance);
	}
	
	public void deposite(double amt)
	{
		balance = balance + amt;
	}
	
	public void withdraw(double amt) throws InsufficientAmountException  
	{
		if(amt>balance)
		{
			//System.out.println("Sorry,insufficient balance, you need more balance");
			throw new InsufficientAmountException (amt-balance);
		}
		else
		{
			balance = balance - amt;
		}
	}
}

public class Assig_004 {

	public static void main(String[] args) { 
		 
		//Account balance is:2000, Enter withdraw amount:2500 Sorry, insufficient balance, you need more 500 Rs. To perform this transaction.

		Bank bo = new Bank();
		bo.getBalance();
		bo.deposite(2000);
		bo.getBalance();
		try 
		{
			bo.withdraw(2500);
		} 
		catch (InsufficientAmountException e) 
		{
			e.printStackTrace();
			e.getMessage();
		}
		bo.getBalance();
		
		

	}

}
