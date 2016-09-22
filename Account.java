package lab;

/**
 * @author Alvarez, MM 
 *
 */

public class Account {
	private int accountNumber;
	private double balance = 0.0;
	
	public Account(int x, double y) {
		this.accountNumber = x;
		this.balance = y;
	}
	
	public Account(int x) {
		this.accountNumber = x;
	}
	
	public int getAccountNumber(){
		return accountNumber;
	}
	
	public double getBalance() {
		return balance =  Math.round(balance * 100.0) / 100.0;
	}
	
	public void setBalance(double amount){
		this.balance = amount;
	}
	
	public void credit(double amount){
		balance += amount;
	}
	
	public void debit(double amount){
		if (balance >= amount) {
			balance -= amount;
		}
		else {
			throw new IllegalArgumentException("Amount withdrawn exceeds current balance!");
		}
	}
	
	public String toString(){
		return String.format("A/C no: %d, Balance = $%.2f", accountNumber, balance);
	}
}

