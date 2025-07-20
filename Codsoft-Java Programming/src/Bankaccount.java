public class Bankaccount{
	//creating a Bank account class
	private int balance;
    private final int pin;

	public Bankaccount(int initialbalance,int PIN)//parameterized-constructor
	{
		this.balance=initialbalance;
		this.pin=PIN;
	}
	public boolean verifyPin(int enteredPIN)
	{
		return this.pin==enteredPIN;
		
	}
	public int getBalance()
	{
		return balance;
	}
	public void deposit(int amount) {
	if(amount>0) {
		balance+=amount;
		
	}
	}
public 	boolean withdraw(int amount)
	{
		if(amount>0 || amount < balance) {
			balance-=amount;
		return true;
	}
return false;
		
	}
}


	

   