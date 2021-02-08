package exception;

public class Account {
	
	private String account;
	private double balance;
	private double interestRate;
	
	public Account() {
		
	}

	public Account(String account, double balance, double interestRate) {
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public double calculateInterest() {
		double result = balance * interestRate;
		return result;
	}
	
	public void deposit(double money) throws Exception{
		if(money > 0) {
			balance += money;
		} else {
			throw new Exception("입급 금액이 0보다 적습니다.");
		}
	}
	
	public void withdraw(double money) throws Exception{
		if(money > 0 && money < balance) {
			balance -= money;
		} else if(money > balance || money < 0){
			throw new Exception("출금 금액이 0보다 적거나 현재 잔액보다 많습니다.");
		}
	}
	
	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	

}
