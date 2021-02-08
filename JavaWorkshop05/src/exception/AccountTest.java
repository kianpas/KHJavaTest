package exception;

public class AccountTest {
	
	public static void main(String[] args) throws Exception {
		
		Account account = new Account("441-0290-1203", 500000.0, 0.073);
		
		System.out.println("계좌정보 : " + account.getAccount() + " " + account.getBalance() + " " + (account.getInterestRate()*100));
		
		//account.deposit(0);
		
		account.withdraw(0);
		
		System.out.println("이자 : " + account.calculateInterest());
		
		
	}

}
