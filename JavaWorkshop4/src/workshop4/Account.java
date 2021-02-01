package workshop4;

public class Account {
	
	private String account;
	private int balance;
	private double interestRate;
	
	public Account() {

	}

	public Account(String account, int balance, double interestRate) {
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public double calculateInterest() {
		double interest = balance*interestRate;
		return interest;
		
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) {
		balance -= money;
	}

		public String accountInfo() {
		return "계좌번호 : " + account + " 잔액 : " + balance + " 이자율 : " + (interestRate*100/10*10)+"%";
	}
	
	
}
