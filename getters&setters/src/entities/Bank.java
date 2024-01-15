package entities;

public class Bank {
	private int accNumber;
	private String accHolder;
	private double balance;
	
	

	public Bank(int accNumber, String accHolder) {
		this.accNumber = accNumber;
		this.accHolder = accHolder;
	}


	public Bank(int accNumber, String accHolder, double initialDeposit) {
		super();
		this.accNumber = accNumber;
		this.accHolder = accHolder;
		deposit(initialDeposit);
	}
	
	public int getAccNumber() {
		return accNumber;
	}


	public String getAccHolder() {
		return accHolder;
	}


	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}


	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}
	public void withdrawal(double amount) {
		balance -= amount;
	}
	public String toString() {
		return " Account: " + accNumber + ", Holder: " + accHolder + ", Balance: $" + balance;
	}
	
}
